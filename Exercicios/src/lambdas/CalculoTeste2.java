package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		//caso a interface não seja funcional não é possivel utilizar functions lambdas
		Calculo calc = (x , y) -> { // forma mais completa podendo receber diversas sentenças de codigo e o return sendo explicitamente informado
			return x + y;
		};
		
		System.out.println(calc.executar(2, 3));
		
		calc = (x , y) -> x * y;//forma mais enxuta porém só pode receber 1 sentença de codigo não passa um return
		
		System.out.println(calc.executar(2, 3));
	}
}
