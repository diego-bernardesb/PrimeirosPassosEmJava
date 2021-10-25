package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		//n�o recebe nenhum parametro e retorna alguma coisa, ou seja � necessario usar os ().
		Supplier<List<String>> umaLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println(umaLista.get());
		
	}
}
