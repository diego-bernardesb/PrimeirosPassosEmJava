package br.com.diiegob.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.diiegob.cm.excecao.ExplosaoException;

public class Campo {

	private final int linha;
	private final int coluna;

	private boolean aberto;// por padr�o atributos boolean j� s�o difinidos como false;
	private boolean minado;
	private boolean marcado;

	private List<Campo> vizinhos = new ArrayList<>();

	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}

	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int deltaGeral = deltaLinha + deltaColuna;

		if (deltaGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (deltaGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}

	void alternarMarcacao() {// permite marcar um campo que esteja fechado sinalizando que ali tem minas;
		if (!aberto) {
			marcado = !marcado;
		}
	}

	boolean abrir() {

		if (!aberto && !marcado) {// s� permite abrir uma campo que n�o esteja marcado e fechado;

			aberto = true;

			if (minado) {
				throw new ExplosaoException();// lan�a uma exce��o que o jogo foi perdido pq encontrou uma mina;
			}

			if (vizinhancaSegura()) {
				vizinhos.forEach(v -> v.abrir());// continua abrindo os vizinhos ao redor que n�o estejam minados;
			}
			return true;
		} else {
			return false;
		}
	}

	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v -> v.minado); // verifica se h� vizinhos ao redor que n�o estejam minados;
	}

	void minar() {
		minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}

	public boolean isMarcado() {// isMarcado funciona como um get por se tratar de um boolean � usado o is em
								// vez do get por boas praticas
		return marcado;
	}

	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public boolean isAberto() {
		return aberto;
	}

	public boolean isFechado() {// retorna o campo isAberto como false assim fica dentro de uma variavel para
								// tornar a leitura do codigo mais facil
		return !isAberto();
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}

	boolean objetivoAlcancado() { // definir o estado do campo
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && !marcado;
		return protegido || desvendado;
	}

	long minasNaVizinhaca() {
		return vizinhos.stream().filter(v -> v.minado).count();// filtra a quantidade de distancia at� a mina e
																// representa com numeros
	}

	void reiniciar() { // reinicia o jogo
		aberto = false;
		minado = false;
		marcado = false;
	}

	public String toString() {
		if (marcado) {
			return "x";
		} else if (aberto && minado) {
			return "*";
		} else if (aberto && minasNaVizinhaca() > 0) {
			return Long.toString(minasNaVizinhaca());// imprime os numeros de distancia das minas
		} else if (aberto) {
			return " ";
		} else {
			return "?"; //campos n�o abertos
		}
	}

}
