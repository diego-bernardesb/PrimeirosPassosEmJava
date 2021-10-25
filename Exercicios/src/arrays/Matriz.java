package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos aluno? ");
		int qntAlunos = entrada.nextInt();

		System.out.print("Quantos notas por aluno? ");
		int qntNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qntAlunos][qntNotas];
		
		double total = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];	
			}
		}
		double mediaTurma = total / (qntAlunos * qntNotas);
		System.out.printf("Media da turma é: %.2f\n", mediaTurma);
		
		for(double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		
		entrada.close();
	}
}
