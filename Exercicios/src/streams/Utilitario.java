package streams;

import java.util.function.UnaryOperator;

public class Utilitario {

	private Utilitario() {
		
	}
	
	//operadores unario
	public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLertra = n -> n.charAt(0) +"";
	
	public final static String grito(String n) {//metodo
		return n + "!!! ";
	}
}
