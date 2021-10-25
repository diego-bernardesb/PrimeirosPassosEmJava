package controle.estruturasDeRepeticoes;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		
		System.out.print("Insira um numero inteiro: ");
		numero = entrada.nextInt();
		
		if(numero >= 0 && numero <= 10) {
			System.out.println("sim");
			
			if (numero % 2 == 0) {
				System.out.print("O numero é par");
			} else {
				System.out.print("O numero é impar");
			}
		} else {
			System.out.println("Numero invalido");
		}
		
		
		entrada.close();
	}
}
