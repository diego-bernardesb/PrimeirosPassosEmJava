package arrays;

public class teste {

	public static void main(String[] args) {
		int nLinhas = 3;
		int nColunas = 3;

		int[][] matriz = new int[nLinhas][nColunas];

		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println("");
		}
		
	}
}
