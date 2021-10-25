package lambdas;

public class CalculoTeste1 {

	public static void main(String[] args) {
		
		Calculo calc = new Somar();
		System.out.println(calc.executar(2, 3));
		
		calc = new Multiplicar();
		System.out.println(calc.executar(2, 3));
		
	}
}
