package fundamentos;

public class ConversaoFParaC {
	public static void main(String[] args) {
		double fahrenheit = 86;
		final double conversao = 5.0/9.0;
		final double entrada = fahrenheit - 32;
		
		double celsius = entrada * conversao;
		
		System.out.println("A temperatura de " + fahrenheit + "F° convertida em Celsius é de " + celsius +"C°.");
		
		
	}
}
