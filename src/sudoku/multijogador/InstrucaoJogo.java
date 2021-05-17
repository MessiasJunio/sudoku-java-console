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
public class InstrucaoJogo {

	private int instrucao = 0;
	private Scanner leTeclado;

	public void menu() {

		System.out.println("Bem vindo ao Sudoku obs: Natan é um boiola");
		System.out.println("para ler instruções de como jogar digite \"1\":  ");
		System.out.println("Para iniciar o jogo digite \"2\": ");
		System.out.println("Se desejar sair do jogo  digite um numero negativo: ");
	}

	public void lerInstrucao() {

		System.out.println(
				" Bem vindo ao sudoku multiJogador : A maneira de jogar é o seguinte:\nvão aparecer os numeros de colunas e linhas e o  sudoku");
		System.out.println("você vai escolher primeiro a coluna que deseja alterar e depois a linha de 1 a 9 cada");
		System.out.println(
				"Atencão você tera que escolher um numero de 1 a 9 que seja diferente de todos\nos das colunas e linhas que você escolheu para continuar o jogo ");
		System.out.println("no Sudoku muda-se um pouco as regras, pois você ganhará pontos a medida que jogar certo, e não ganhara quando jogar errado ");
		System.out.println("O jogo termina quando todas colunas estiverem preenchidas corretamente");
		System.out.println("");
	}
}
