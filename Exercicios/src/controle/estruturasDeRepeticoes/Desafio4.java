package controle.estruturasDeRepeticoes;

import java.util.Scanner;

public class Desafio4 {
	public static void main(String[] args) {
		
		int contador = 0; //conta 
		Scanner inputScan = new Scanner(System.in);		
		System.out.print("Insira um numero : ");
		int numero = inputScan.nextInt();
		
		if(	numero < 1 ) System.out.println("Numero invalido");
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contador++;
			};
		}
		
		if(contador == 0) {
			System.out.printf("O %d é um numero primo.", numero);
		} else {
			System.out.printf("O %d não é um numero primo.", numero);
		}
		
		inputScan.close();
	}
}
