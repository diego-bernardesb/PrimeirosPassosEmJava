package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTest {

	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		ferrari.ligarAr();
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		
		
		System.out.println(civic.toString());
		System.out.println(ferrari.toString());
		System.out.println(ferrari.velocidadeDoAr());
		
		ferrari.desligarTurbo();
		ferrari.frear();
		ferrari.frear();
		
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		
		System.out.println(civic.toString());
		System.out.println(ferrari.toString());
		
	}
}
