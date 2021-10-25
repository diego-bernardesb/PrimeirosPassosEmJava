package lambdas;

import java.util.Arrays;
import java.util.List;

public class forEach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma Tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambdas #1...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));//->forma reduzida
//		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});//->forma tradicional para 2 ou mais parametros é preciso estar dentro de parenteses
		
		System.out.println("\nLambdas #2...");
		aprovados.forEach(nome -> meuImprimir(nome + "!!!"));
		
		
		System.out.println("\nMethod Reference #1...");
		aprovados.forEach(System.out::println);
		//utiliza a referencia do metodo para percorrer toda a lista imprimindo todos os nomes
		
		
		System.out.println("\nMethod Reference #2...");
		aprovados.forEach(forEach::meuImprimir);
		
		
	}
	
	static void meuImprimir(String nome) { //metodo definido fora do metodo main
		System.out.println("Olá meu nome é " + nome);
	}
}
