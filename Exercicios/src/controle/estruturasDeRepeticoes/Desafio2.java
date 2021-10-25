package controle.estruturasDeRepeticoes;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Insira o Ano: ");
		int ano = entrada.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.printf("O %d é Bissexto", ano);
		} else {
			System.out.printf("O %d não é Bissexto", ano);
		}
		
		entrada.close();
	}
}
