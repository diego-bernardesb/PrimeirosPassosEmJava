package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println(7/ entrada.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { // assegura que o codigo sera executado msm que um erro seja trato não chego no bloco seguinte
			System.out.println("Finally #01...");
//			entrada.close();			
		}

		try {
			System.out.println(7/ entrada.nextInt());
		} finally { // assegura que o codigo sera executado msm que um erro seja trato não chego no bloco seguinte
			System.out.println("Finally #02...");
			entrada.close();			
		}
		
		System.out.println("Fim... :)");
	}
}
