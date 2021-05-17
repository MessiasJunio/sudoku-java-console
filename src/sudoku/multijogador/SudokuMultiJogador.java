/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku.multijogador;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author messi_000
 */
public class SudokuMultiJogador {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {

		Jogabilidade jogo = new Jogabilidade();
		ArrayList<Jogabilidade> jogador = new ArrayList<>();
		InstrucaoJogo mostraInstrucao = new InstrucaoJogo();
		Scanner leTeclado = new Scanner(System.in);
		
		int comecar = 1;

		do {

			if (comecar == 1) {
				try {
					mostraInstrucao.menu();
					comecar = leTeclado.nextInt();
				} catch (Exception e) {
					System.out.println("que porcaria você esta tentando fazer ");
					break;
				}
				if (comecar == 1) {
					mostraInstrucao.lerInstrucao();
				}
			} else if (comecar < 0) {

				System.out.println("saiu do jogo");
				break;

			} else if (comecar == 2) {

				try {
					jogo.jogar();
				} catch (InputMismatchException ime) {
					System.out.println("Preste atenção!!!!!! Caracteres inválidos Tente novamente");
				} catch (Exception e) {
					System.out.println("vish!!!! Algum valor desses não é válido mano");
				}

			}

		} while (comecar != 4);

	}

}
