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
public class Jogabilidade extends Tabela {
	private Scanner leTeclado;
	private int[][] jogada;
	private int[][] validarPontuacao;
	private String jogador1, jogador2;
	private boolean vezJogar = true;
	private int pontuacaoJogador1, pontuacaoJogador2;

	public void jogar() {

		if (vezJogar == true) {
			leTeclado = new Scanner(System.in);
			System.out.println("Vamos começar");
			System.out.println("");
			System.out.print("Digite o nome do jogador 1: ");
			jogador1 = leTeclado.next();

			System.out.print("Agora digite o nome do jogador 2: ");
			jogador2 = leTeclado.next();

		}

		vezJogar = false;

		ValidarSudoku validar = new ValidarSudoku();

		int linhaJogador1 = 1;
		int linhaJogador2 = 2;

		int colunaJogador1 = 1;
		int colunaJogador2 = 2;
		int valorJogar = 0;

		// jogador 1

		mostraSudoku();
		System.out.println("Vez do " + jogador1);
		System.out.println("Se desejar terminar e ver pontuação digite um numero negativo em coluna");
		System.out.print("Digite a coluna que deseja preencher: ");
		colunaJogador1 = leTeclado.nextInt();
		colunaJogador1--;

		if (colunaJogador1 < 0) {
			System.out.println("");
			System.out.println("Ranking de Pontuação");
			System.out.println(jogador1 + " fez " + pontuacaoJogador1 + " pontos ");
			System.out.println(jogador2 + " fez " + pontuacaoJogador2 + " pontos");
			if (pontuacaoJogador1 > pontuacaoJogador2) {
				System.out.println(jogador1 + " ganhou o jogo !!!wwou, parabéns");
			} else if (pontuacaoJogador2 > pontuacaoJogador1) {
				System.out.println(jogador2 + " venceu!!!!!uau, muito bom");
			} else {
				System.out.println("Empatou, ooooh partida assirrada");
			}
			System.exit(0);
		}

		System.out.print("Digite a linha que deseja preencher: ");
		linhaJogador1 = leTeclado.nextInt();
		linhaJogador1--;

		System.out.print("Agora digite o numero que deseja preencher: ");
		valorJogar = leTeclado.nextInt();

		if (validar.validarJogada(valorJogar, linhaJogador1, colunaJogador1) && validar.isJogada() == true) {
			jogada = getSudokuValores();
			validarPontuacao = getValoresPadrao();

			for (int i = 0; i < getSudokuValores().length; i++) {
				if (jogada[linhaJogador2][colunaJogador2] != jogada[linhaJogador1][colunaJogador1]) {
					jogada[linhaJogador1][colunaJogador1] = valorJogar;

					if (validarPontuacao[linhaJogador1][colunaJogador1] == 0) {
						validarPontuacao[linhaJogador1][colunaJogador1] = jogada[linhaJogador1][colunaJogador1];
						pontuacaoJogador1++;
						System.out.println(jogador1 + " marcou " + pontuacaoJogador1 + " pontos");
						break;
					} else {
						System.out.println("blz, mas você não marcou pontos");
						break;
					}

				} else {
					System.out.println(jogador1 + " Você não marcou pontos desta vez|!!!|, jogada inválida");
					break;
				}
			}
		}

		// jogador2
		mostraSudoku();
		System.out.println("Vez do " + jogador2);
		System.out.println("Se desejar terminar e ver pontuação digite um numero negativo em coluna");
		System.out.print("Digite a coluna que deseja preencher: ");
		colunaJogador2 = leTeclado.nextInt();
		colunaJogador2--;

		if (colunaJogador2 < 0) {
			System.out.println("");
			System.out.println("Ranking de Pontuação");
			System.out.println(jogador1 + " fez " + pontuacaoJogador1 + " pontos ");
			System.out.println(jogador2 + " fez " + pontuacaoJogador2 + " pontos");
			if (pontuacaoJogador1 > pontuacaoJogador2) {
				
				System.out.println(jogador1 + " ganhou o jogo !!!wwou, parabéns");
			} else if (pontuacaoJogador2 > pontuacaoJogador1) {

				System.out.println(jogador2 + " venceu!!!!!uau, muito bom");
			} else {
				System.out.println("Empatou, ooooh partida assirrada");
			}
			System.exit(0);
		}

		System.out.print("Digite a linha que deseja preencher: ");
		linhaJogador2 = leTeclado.nextInt();
		linhaJogador2--;

		System.out.print("Agora digite o numero que deseja preencher: ");
		valorJogar = leTeclado.nextInt();

		if (validar.validarJogada(valorJogar, linhaJogador2, colunaJogador2) && validar.isJogada() == true) {
			jogada = getSudokuValores();
			validarPontuacao = getValoresPadrao();

			for (int j = 0; j < getSudokuValores().length; j++) {

				if (jogada[linhaJogador2][colunaJogador2] != jogada[linhaJogador1][colunaJogador1]) {
					jogada[linhaJogador2][colunaJogador2] = valorJogar;

					if (validarPontuacao[linhaJogador2][colunaJogador2] == 0) {

						validarPontuacao[linhaJogador2][colunaJogador2] = jogada[linhaJogador2][colunaJogador2];
						System.out.println("blz continue");

						pontuacaoJogador2++;
						System.out.println(jogador2 + " marcou " + pontuacaoJogador2 + " pontos");
						break;
					} else {
						System.out.println("Você não marcou pontos");
						break;
					}

				} else {
					System.out.println(
							jogador2 + " Você não marcou pontos desta vez(???), Mais Atenção, Tente novamente ");
					break;
				}
			}
		}
		/*
		 * if(linhaJogador1 == -2 ){ System.out.println("Ranking de Pontuação");
		 * System.out.println(jogador1 + " teve a pontuação de " +
		 * pontuacaoJogador1 ); System.out.println(jogador2 +
		 * " teve a pontução de " + pontuacaoJogador2); if(pontuacaoJogador1 >
		 * pontuacaoJogador2){ System.out.println(jogador1 +
		 * " ganhou o jogo !!!wwou, parabéns"); }else if(pontuacaoJogador2 >
		 * pontuacaoJogador1){ System.out.println(jogador2 +
		 * " venceu!!!!!uau, muito bom"); } System.exit(0); }
		 */
	}

	public int[][] getJogada() {
		return jogada;

	}
}