package br.com.diiegob.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.diiegob.cm.excecao.ExplosaoException;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;

	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;

		gerarCampos();
		associarVizinhos();
		sortearMinas();

	}

	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
					.ifPresent(c -> c.abrir());
		} catch (ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
				.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {// cria um tabuleiro com o tamanho de linhas e colunas
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}
		}
	}

	private void associarVizinhos() { // rota todos os campos e associa os vizinhos caso possivel seguindo a logica
										// addVizinho
		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}

	private void sortearMinas() {// sorteia as minas aleatoriamente nos campos
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();// interface para verificar se o campo está minado

		do {// loop para add todas as minas
			int aleatorio = (int) (Math.random() * campos.size());// sorteia um campo baseado no tamanho total do
			campos.get(aleatorio).minar();// add a mina no campo sorteado
			minasArmadas = campos.stream().filter(minado).count(); // filtra se o campo está minado e a quantidade
																	// tabuleiro
		} while (minasArmadas < minas);// identifica se o numero de minas definido já está completo
	}

	public boolean objetivoAlcancado() {// define se o jogo foi terminado(ganhou ou perdeu)
		return campos.stream().allMatch(c -> c.objetivoAlcancado());// todos os campos tiveram o objetivo alcançado
																	// termina o jogo
	}

	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());// reinicia todos os campos do tabuleiro para false
		sortearMinas();// sorteia as minas no tabuleiro
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("  ");
		for (int c = 0; c < linhas; c++) {
			sb.append(" "); 
			sb.append(c); 
			sb.append(" "); 
		}		
		sb.append("\n");
		
		int i = 0;
		for (int l = 0; l < linhas; l++) {			
			sb.append(l);
			sb.append(" ");
			for (int c = 0; c < colunas; c++) {

				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}

		return sb.toString();
	}
}
