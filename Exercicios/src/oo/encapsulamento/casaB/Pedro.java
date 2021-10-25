package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{

	void testeDeAcesso() {
		
//		System.out.println(segredo); //private apenas a propria classe pode acessar
//		System.out.println(facoDentroDeCasa); //default não pode acessar fora do pacote
		System.out.println(formaDeFalar); //protectd fora do pacote só pode ser acessado de forma de herança
		System.out.println(todosSabem); //public todos podem acessar
				
	}
}
