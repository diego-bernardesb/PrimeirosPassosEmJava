package br.com.diiegob.cm;

import br.com.diiegob.cm.modelo.Tabuleiro;
import br.com.diiegob.cm.visao.tabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(3, 3, 2);
		
		new tabuleiroConsole(tabuleiro);
		
		
	}
}
