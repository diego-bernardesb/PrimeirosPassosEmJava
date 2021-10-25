package controle.estruturasDeRepeticoes;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		int qntNotas = 0;
		double total = 0;
		
		
		while(nota != -1) { //o loop se repete enquanto não receber o -1 para interromper o loop
			System.out.print("Insira uma nota valida: ");
			nota = entrada.nextDouble();

			if(nota >= 0 && nota <= 10) {
				total += nota;
				qntNotas ++;
			} else if(nota != -1) {
				System.out.print("Nota invalida, insira um valor valido!");
			}
		}
		
		//media
		
		double media = total / qntNotas;
		System.out.printf("Média = %.2f",media);
		
		entrada.close();
	}
}
