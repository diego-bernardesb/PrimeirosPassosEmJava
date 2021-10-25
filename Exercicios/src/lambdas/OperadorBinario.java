package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		//os parametros precisão ser expressados entre parenteses e podem receber explicitamente o tipo do operador
		BinaryOperator<Double> media = (n1 , n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.2, 5.3));
		
		//recebe 2 parametros e retorna uma tipo tras mais funcionalidade e menor aproveitamento do codigo nesse caso  recebe 2 double e retorna uma string
		BiFunction<Double, Double, String> resultado = 
				(n1, n2) -> ((n1 + n2) / 2 ) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(9.1, 4.9));
		

		//recebe um tipo e retorna outro, dessa forma podendo receber o resultado de um binaryOperator e encadear com a função trazendo mais reuso do codigo
		Function<Double, String> conteito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(conteito).apply(9.1, 4.3));
		
		
	}
}
