package br.com.diiego.app.financeiro;

import java.util.ServiceLoader;

import br.com.diiego.app.Calculadora;

public class Teste {

	public static void main(String[] args) {
		
		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.print(calc.somar(2, 3, 4));
		
//		OperacoesAritimeticas op = new OperacoesAritimeticas();
//		System.out.println(op.somar(4, 5, 6));
		
	}
}
