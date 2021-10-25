package controle.estruturasDeRepeticoes;

import java.util.Scanner;

public class Desafio5 {
	public static void main(String[] args) {
		
		int contador = 0;
		Scanner inputScan = new Scanner(System.in);
		System.out.print("Insira um numero : ");
		int numero = inputScan.nextInt();
		
		if(	numero < 1 ) System.out.println("Numero invalido");
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		
		switch (contador) {
		case 0: 
			System.out.printf("O %d é um numero primo.", numero);
			break;
		default:
			System.out.printf("O %d não é um numero primo.", numero);			
		}
				
		inputScan.close();
		
	}
}
