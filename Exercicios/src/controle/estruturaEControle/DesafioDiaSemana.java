package controle.estruturaEControle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Defina o dia da semana: ");
		
		String dia = entrada.next();

//		if(dia.equalsIgnoreCase("Domingo")) { //O equalsIgnoreCase - ignora letras maiusculas e minusculas
//			System.out.println("1");
//		}
		
//		if("domingo".equalsIgnoreCase(dia)) {//Outra formula valida � usar a expres�o em vez da variavel para fazer a busca
//			System.out.println("1");
//		}
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println("1");
		}else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("2");
		}else if (dia.equalsIgnoreCase("Ter�a") || dia.equalsIgnoreCase("Terca")) {
			System.out.println("3");
		}else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
		}else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		}else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
		}else if (dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("S�bado")) {
			System.out.println("7");
		}
		
		entrada.close();
	}
}