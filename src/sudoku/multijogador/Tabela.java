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
public class Tabela {

	private int[][] sudokuValores = new int[][] { { 0, 0, 2, 0, 9, 3, 7, 4, 0 }, { 4, 5, 3, 2, 1, 7, 0, 0, 8 },
			{ 0, 0, 6, 5, 0, 0, 0, 0, 3 }, { 3, 0, 0, 0, 0, 0, 0, 8, 2 }, { 1, 8, 0, 0, 0, 0, 0, 0, 4 },
			{ 0, 6, 5, 9, 0, 4, 0, 0, 7 }, { 0, 4, 7, 8, 3, 0, 2, 0, 9 }, { 5, 0, 0, 0, 0, 0, 8, 0, 6 },
			{ 0, 2, 0, 7, 5, 0, 0, 3, 1 } }; // Linhas e colunas do array

	private int[][] valoresPadrao = new int[][] { { 0, 0, 1, 0, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1 },
			{ 0, 0, 1, 1, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 1, 1 }, { 1, 1, 0, 0, 0, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 0, 0, 1 }, { 0, 1, 1, 1, 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1, 0, 1 },
			{ 0, 1, 0, 1, 1, 0, 0, 1, 1 } }; // Tabela padrão

	private Scanner leTeclado;

	

	// Mostrar tabela sudoku
	public void mostraSudoku() {
	
		System.out.println("                                    Colunas");// Nome
																			// que
																			// aparece
																			// indicando
																			// as
																			// colunas

		System.out.println("");// espacao entre o titulo e os numeros
								// corresponte a linha do sudoku

		for (int numeraColunas = 0; numeraColunas < sudokuValores.length; numeraColunas++) {
			/*
			 * Está estutura for vai mostra os numeros do array para que o
			 * usuario possa indendificar a linhas que vai colocar o numero
			 */
			if (numeraColunas == 0) {
				System.out.print("                       ");
			}
			System.out.print((numeraColunas + 1) + "   ");

		}

		System.out.println("");

		for (int frescura = 0; frescura < sudokuValores.length; frescura++) {
			/*
			 * Está estrutura for faz aparecer ______ debaixo do numeros
			 * correspondentes a linhas
			 */
			if (frescura == 0) {

				System.out.print("                     _");
			}
			System.out.print("____");
		}
		System.out.println("");

		for (int sudokuLinhas = 0; sudokuLinhas < sudokuValores.length; sudokuLinhas++) {
			if (sudokuLinhas == 4) {// se o valor for 4 coloque a palavra linha
									// a sua esquerda

				System.out.print("Linhas");
			}
			if (sudokuLinhas != 4) {
				System.out.print("      ");// da espaco nos numeros diferente de
											// quadro na numeracao da linhas
			}

			System.out.print("           " + (sudokuLinhas + 1) + "=> | ");// coloca
																			// a
																			// numerão
																			// das
																			// linhas
																			// junto
																			// com
																			// as
																			// setas

			for (int sudokuColunas = 0; sudokuColunas < sudokuValores.length; sudokuColunas++) {
				 
				System.out.print(sudokuValores[sudokuLinhas][sudokuColunas]  + " | ");
			}
			System.out.println("\n");
		}

	}

	public int[][] getSudokuValores() {
		return sudokuValores;
	}

	public void setSudokuValores(int[][] sudokuValores) {
		this.sudokuValores = sudokuValores;
	}

	public int[][] getValoresPadrao() {
		return valoresPadrao;
	}
}
