package br.com.diiegob.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.diiegob.cm.excecao.ExplosaoException;
import br.com.diiegob.cm.excecao.SairException;
import br.com.diiegob.cm.modelo.Tabuleiro;

public class tabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public tabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;

			while (continuar) {// quer continuar a jogar?
				cicloDoJogo();

				System.out.println("Outra partida? (S/n) ");
				String resposta = entrada.nextLine();// pega a resposta

				if ("s".equalsIgnoreCase(resposta)) {// se não
					tabuleiro.reiniciar();// reinicia o tabuleiro
				}
			}
		} catch (SairException e) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();// certifica de fechar o scanner quando sair do jogo
		}

	}

	private void cicloDoJogo() {
		try {

			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);

				String digitado = capturaValorDigitado("Digite (x, y): ");// recebe o valor de linha x coluna

				Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim()))
						.iterator();// converte os valores para inteiros

				digitado = capturaValorDigitado("1 - Abrir, 2 - (Des)Marcar: ");//captura os valores para definir a ação tomada no jogo
				if ("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
			}

			System.out.println("Você ganhou!!!!");
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Você perdeu !");
		}
	}

	private String capturaValorDigitado(String texto) {// captura o valor digitado
		System.out.print(texto);
		String digitado = entrada.nextLine();

		if ("sair".equalsIgnoreCase(digitado)) {// se for a palavra sair lança a excecçao para sair do jogo
			throw new SairException();
		}

		return digitado;
	}

}
