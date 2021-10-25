package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par": "Ímpar";
		
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";	
		
		System.out.println(parOuImpar.apply(50)); //chama a função
		System.out.println(parOuImpar.andThen(oResultadoE).apply(35));//chama uma função e interligada a outra função
		System.out.println(parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(35));//chama uma função e interligada a outra função que é ligada a mais uma função	
		System.out.println(parOuImpar.andThen(oResultadoE).andThen(duvida).apply(35));
		
	}
}
