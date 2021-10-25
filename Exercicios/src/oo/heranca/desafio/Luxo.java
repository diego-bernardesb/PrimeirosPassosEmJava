package oo.heranca.desafio;

public interface Luxo {

	void ligarAr(); //todo metodo dentro de interface � public e abstract(s�o metodos sem corpo)
	void desligarAr();
	
	//todo metodo abstrato deve ser definido na classe filho, por�m com o modo default � possivel definir o metodo para ter um 	comportamento padr�o para que n�o tenha que ser definido nas demais classes.
	default int velocidadeDoAr() {
		return 1;
	}
}
