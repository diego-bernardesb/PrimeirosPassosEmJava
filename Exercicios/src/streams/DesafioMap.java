package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		/*
		 * 1. Converter numeros inteiros em string binaria 6 => "110"
		 * 2. Inverter a ordem da string... "110" => "011"
		 * 3. Converter de volta para numero inteiro "011" => 3
		 * 
		 * Dica Integer.
		 */
		
		List<Integer> nums = Arrays.asList(1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 );
		Consumer<Object> print = System.out::println;
		
		//passa uma string para o construtor, reverter as string, e escreve a string
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		
		//converte um numero binario para inteiro
		Function<String, Integer> numInteiro = s -> Integer.parseInt(s, 2);
		
		
		nums.stream()
			.map(Integer::toBinaryString)//usa uma referencia ao metodo toBinaryString->convertendo int em binario
			.map(inverter)
			.map(numInteiro)
			.forEach(print);
		
		
	}
}
