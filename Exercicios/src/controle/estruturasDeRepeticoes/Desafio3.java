package controle.estruturasDeRepeticoes;

import java.util.Scanner;

public class Desafio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Insira a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Insira a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.printf("Sua media � %.2f, parab�ns voc� est� aprovado!",media);		
		} else if(media < 7.0 && media >= 4.0) {
			System.out.printf("Sua media � %.2f, que pena voc� est� de recupera��o!",media);				
		} else {
			System.out.printf("Sua media � %.2f, infelizmente voc� reprovou!",media);		
		}
			
		
		entrada.close();
	}
}
