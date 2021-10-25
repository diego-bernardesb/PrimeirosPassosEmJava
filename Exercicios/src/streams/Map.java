package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {

		
		Consumer<String> print = System.out::print;
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLertra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!! ";
		
		List<String> marcas = Arrays.asList("BMW " , "Audi ", "Honda ");
		marcas.stream().map(Utilitario.maiuscula).forEach(print);
		
		System.out.println("\n\nUsando Composição...");
		marcas.stream()
			.map(Utilitario.maiuscula)//usando como metodo
			.map(primeiraLertra)
			.map(Utilitario::grito)//usando como method reference
			.forEach(print);
		
		
	}
}
