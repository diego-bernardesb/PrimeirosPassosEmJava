package br.com.diiegob.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {

	private final int linhas;
	private final int colunas;
	private final int minas;

	private final List<Campo> campos = new ArrayList<>();
	private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		super();
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;

		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}

	public void registrarObservador(Consumer<ResultadoEvento> observardor) {
		observadores.add(observardor);

	}

	private void notificarObservadores(boolean resultado) {
		observadores.stream().forEach(o -> o.accept(new ResultadoEvento(resultado)));
	}

	public void abrir(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
				.ifPresent(c -> c.abrir());
	}

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
				.ifPresent(c -> c.alternarMarcacao());
	}

	private void gerarCampos() {// cria um tabuleiro com o tamanho de linhas e colunas
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registraObservador(this);
				campos.add(campo);
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

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public int getMinas() {
		return minas;
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		if (evento == CampoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		} else if (objetivoAlcancado()) {
			notificarObservadores(true);
		}
	}

	private void mostrarMinas() {
		campos.stream().filter(c -> c.isMinado()).filter(c -> !c.isMarcado()).forEach(c -> c.setAberto(true));
	}

}
