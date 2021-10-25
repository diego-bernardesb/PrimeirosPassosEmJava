package oo.encapsulamento.polimorfismo;

public abstract class Comida {//comida passa ser a classe pai que dá a heranca para todos os tipos de comida assim aplicando o polimorfismo.
	//a class comida passa a ser abstrata e não pode mais ser instanciada, assim um comida sempre vai precisar pertencer a um grupo especifico
	
	
	double peso;
	
	public Comida(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
