package exercicios;

import java.util.Scanner;

public class QuadradoECubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("informe o numero: ");
		double num = entrada.nextDouble();

		System.out.print("informe o expoente: ");
		double expoente = entrada.nextDouble();
			
		double resultado = Math.pow(num, expoente);
		
		System.out.printf("O reseultado da potenciação de %.2f elevado a %.2f é de: %.2f.", num, expoente, resultado);
		
		
		entrada.close();
	}
}
