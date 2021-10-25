package oo.heranca.desafio;

public interface Luxo {

	void ligarAr(); //todo metodo dentro de interface é public e abstract(são metodos sem corpo)
	void desligarAr();
	
	//todo metodo abstrato deve ser definido na classe filho, porém com o modo default é possivel definir o metodo para ter um 	comportamento padrão para que não tenha que ser definido nas demais classes.
	default int velocidadeDoAr() {
		return 1;
	}
}
