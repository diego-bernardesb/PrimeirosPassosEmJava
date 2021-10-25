package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par": "�mpar";
		
		Function<String, String> oResultadoE = valor -> "O resultado �: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";	
		
		System.out.println(parOuImpar.apply(50)); //chama a fun��o
		System.out.println(parOuImpar.andThen(oResultadoE).apply(35));//chama uma fun��o e interligada a outra fun��o
		System.out.println(parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(35));//chama uma fun��o e interligada a outra fun��o que � ligada a mais uma fun��o	
		System.out.println(parOuImpar.andThen(oResultadoE).andThen(duvida).apply(35));
		
	}
}
