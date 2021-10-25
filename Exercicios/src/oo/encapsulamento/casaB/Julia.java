package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testeDeAcesso() {

//		System.out.println(sogra.segredo); //private apenas a propria classe pode acessar
//		System.out.println(sogra.facoDentroDeCasa); //default todo o pacote pode acessar
//		System.out.println(sogra.formaDeFalar); //protectd pacote e herança pode acessar
		System.out.println(sogra.todosSabem); //public todos podem acessar
				
	}
}
