package exercicios;

import java.util.Scanner;

public class FormulaBhaskara {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Informe o valor de ax²: ");
		double a = entrada.nextDouble();
		
		System.out.print("Informe o valor de bx: ");
		double b = entrada.nextDouble();
		
		System.out.print("Informe o valor de c: ");
		double c = entrada.nextDouble();
		
		double delta = (Math.sqrt((Math.pow(b, 2) - 4 * a * c)));
		System.out.printf("%.2f\n" ,delta);
		
		double resultadoP = ((-1 *  b) + delta) / 2 * a;
		double resultadoN = ((-1 *  b) - delta) / 2 * a;
			
		System.out.printf("O resultado da formula de bhaskara é de %.2f ou %.2f.", resultadoP, resultadoN);
		
		entrada.close();		
	}
}
