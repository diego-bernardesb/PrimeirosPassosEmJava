package controle.operadores;

import java.util.Scanner;

public class PesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Informe um numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Informe uma operação: ");
		String op = entrada.next();
		
		System.out.println("Informe um numero: ");
		double num2 = entrada.nextDouble();
		
		//logica
		double resultado = "+".equals(op)? num1 + num2 : 0 ;
		resultado = "-".equals(op)? num1 - num2 : resultado ;
		resultado = "*".equals(op)? num1 * num2 : resultado ;
		resultado = "/".equals(op)? num1 / num2 : resultado ;
		resultado = "%".equals(op)? num1 % num2 : resultado ;
		
		System.out.printf("O resultado é: %.2f", resultado);
		
		entrada.close();
	}
}
