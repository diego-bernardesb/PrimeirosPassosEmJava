package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixa = new Caixa<>();
		caixa.guardar("Hello World!");
		
		String coisa1 = caixa.abrir();
		System.out.println(coisa1);
		
		Caixa<Double> caixa2 = new Caixa<>();
		caixa2.guardar(289.99);
		
		Double coisa2 = caixa2.abrir();
		System.out.println(coisa2);
	}
}
