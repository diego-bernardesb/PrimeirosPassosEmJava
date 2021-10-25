package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeDeAcesso() {

//		System.out.println(esposa.segredo); //private apenas a propria classe pode acessar
		System.out.println(esposa.facoDentroDeCasa); //default todo o pacote pode acessar
		System.out.println(esposa.formaDeFalar); //protectd pacote e herança pode acessar
		System.out.println(esposa.todosSabem); //public todos podem acessar
				
	}
}
