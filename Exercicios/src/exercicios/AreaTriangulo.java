package exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Insia o valor da altura do triangulo: ");
			double alturaTriangulo = entrada.nextDouble();

			System.out.println("Insia o valor da base do triangulo: ");
			double baseTriangulo = entrada.nextDouble();
			
			double resultado = (alturaTriangulo * baseTriangulo) / 2;
			
			System.out.printf("A área do triangulo é igual a: %.2fm²", resultado);
			
			
			entrada.close();
	}
}
