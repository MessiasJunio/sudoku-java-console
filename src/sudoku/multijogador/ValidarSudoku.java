/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.multijogador;

import java.util.Scanner;

/**
 *
 * @author messi_000
 */
public class ValidarSudoku extends Jogabilidade {

	private boolean jogada = true;
	private int sudokuValidar[][];
	private int valoresPadrao[][];
	private Scanner leTeclado;

	// validar jogadas e tentativas
	public boolean validarJogada(int valorJogar, int linha, int coluna) {

		sudokuValidar = getSudokuValores();

		valoresPadrao = getValoresPadrao();
		leTeclado = new Scanner(System.in);
		jogada = true;

		if (valorJogar > 9) {
			System.out.println("o sudoku só pode conter valores de 1 à 9");
			jogada = false;
		}
		for (int v = 0; v < sudokuValidar.length; v++) {
			if (sudokuValidar[v][coluna] == valorJogar) {
				System.out.println("Este numera já existe na vertical, então não marcou pontos");
				jogada = false;
			}
		}

		for (int c = 0; c < sudokuValidar.length; c++) {
			if (sudokuValidar[linha][c] == valorJogar) {
				System.out.println("Existe numero já existe na horizontal, Nada de pontos");
				jogada = false;
			}
		}
		if (valoresPadrao[linha][coluna] == 1) {
			System.out.println("Valores padrões não podem ser alterados!!!!!");
			System.out.println("Desse jeito você não marca pontos |\\Brother \\");
			jogada = false;
		}

		return jogada;

	}

	public boolean isJogada() {
		return jogada;
	}

}
