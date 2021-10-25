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
			System.out.printf("Sua media é %.2f, parabéns você está aprovado!",media);		
		} else if(media < 7.0 && media >= 4.0) {
			System.out.printf("Sua media é %.2f, que pena você está de recuperação!",media);				
		} else {
			System.out.printf("Sua media é %.2f, infelizmente você reprovou!",media);		
		}
			
		
		entrada.close();
	}
}
