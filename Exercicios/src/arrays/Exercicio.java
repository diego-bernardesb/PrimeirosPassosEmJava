package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];//criar arrays- o tamanho do array deve ser definido na criação
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 9;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA));//para imprimir arrays é necessario usar a função Arrays. e importar do java.util
		System.out.println(notasAlunoA[0]);//imprimir o indicie indicado
		System.out.println(notasAlunoA[notasAlunoA.length -1]);//imprimir o ultimo indicie do array
//		System.out.println(notasAlunoA[4]); se o indicie não for existente é apresentado um erro
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {// soma de todos os itens do array
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);// calculo de media do array
		
		final double notasArmazenadas = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notasArmazenadas , 10}; //forma de criar um array literal é usando {} e não []
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}

		System.out.println(totalAlunoB / notasAlunoB.length);// calculo de media do array
	}
}
