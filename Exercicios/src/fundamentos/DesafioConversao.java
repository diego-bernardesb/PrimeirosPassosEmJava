package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner salario = new Scanner(System.in);
		
		System.out.print("Informe o salario do primeiro mês: ");
		String primeiroMes = salario.nextLine().replace("," , ".");
		
		System.out.print("Informe o salario do segundo mês: ");
		String segundoMes = salario.nextLine().replace("," , ".");
		
		System.out.print("Informe o salario do terceiro mês: ");
		String terceiroMes = salario.nextLine().replace("," , ".");
		
	
		double media = (Double.parseDouble(primeiroMes) + Double.parseDouble(segundoMes) + Double.parseDouble(terceiroMes))/ 3;
		System.out.printf("A media dos salarios dos ultimos 3 meses é de: %.2f" ,media);
		
		salario.close();
	}
}