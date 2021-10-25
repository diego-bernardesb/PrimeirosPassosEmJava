package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner salario = new Scanner(System.in);
		
		System.out.print("Informe o salario do primeiro m�s: ");
		String primeiroMes = salario.nextLine().replace("," , ".");
		
		System.out.print("Informe o salario do segundo m�s: ");
		String segundoMes = salario.nextLine().replace("," , ".");
		
		System.out.print("Informe o salario do terceiro m�s: ");
		String terceiroMes = salario.nextLine().replace("," , ".");
		
	
		double media = (Double.parseDouble(primeiroMes) + Double.parseDouble(segundoMes) + Double.parseDouble(terceiroMes))/ 3;
		System.out.printf("A media dos salarios dos ultimos 3 meses � de: %.2f" ,media);
		
		salario.close();
	}
}