package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Bom");//executa o print e permanece na msm linha
		System.out.print(" dia!\n");//o \n representa a quebra de linha
		
		System.out.println("Bom");//println executa o codigo e pula uma linha para o proximo codigo
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d% d %d %d %d %n", 1, 2, 3, 4, 5, 6);//faz um print formatado com o %d para mostrar numeros
		
		System.out.printf("Salário: %.1f%n", 1234.567);//o %.1f representa os numeros com casas decimais, e o numero depois do ponto representa a quantidade de casas
		System.out.printf("Nome: %s%n", "João");//o %s representa uma string
		
		Scanner entrada = new Scanner(System.in);//o scanner é usado para pegar informações por uma entrada definida
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
	}

}