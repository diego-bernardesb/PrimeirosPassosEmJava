package classe;

public class Pessoa {
	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	void Comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}

	String apresentar() {
		return String.format("Olá eu sou %s e tenho %.2f KGs", this.nome, this.peso);
	}
}
