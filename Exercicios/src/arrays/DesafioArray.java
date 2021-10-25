package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		
		int qntNotas = entrada.nextInt();
		double[] notas = new double[qntNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota "+ (i + 1)+ ":");
			notas[i] = entrada.nextDouble();		
		}
		
		System.out.println("As notas são: " + Arrays.toString(notas));//função pra imprimir os indicies da array
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total/notas.length;
		System.out.println("A média é : " + media + "!");
		
		entrada.close();
	}
}
