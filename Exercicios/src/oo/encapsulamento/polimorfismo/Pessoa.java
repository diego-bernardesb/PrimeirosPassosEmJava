package oo.encapsulamento.polimorfismo;

public class Pessoa {

	double peso;
	
	public Pessoa(double peso) {
		this.peso = peso;
	}
	
	public void Comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
