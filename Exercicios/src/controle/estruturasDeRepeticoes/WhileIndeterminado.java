package controle.estruturasDeRepeticoes;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {//enquanto a string valor n�o tiver a palavra sair ela repete o loop.
			System.out.print("Vo�� diz: ");
			valor = entrada.nextLine();
		}
		
		
		entrada.close();
	}
}
