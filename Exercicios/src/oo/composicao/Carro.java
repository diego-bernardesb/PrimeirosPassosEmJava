package oo.composicao;

public class Carro {

	Motor motor;
	
	Carro(){
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if(motor.fatorDeInjecao < 1.9) {
			motor.fatorDeInjecao += 0.4;			
		}
	}
	
	void frear() {
		if(motor.fatorDeInjecao > 0.5) {
			motor.fatorDeInjecao -= 0.4;			
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
