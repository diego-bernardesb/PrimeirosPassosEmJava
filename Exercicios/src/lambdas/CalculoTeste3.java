package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		//caso a interface não seja funcional não é possivel utilizar functions lambdas
		BinaryOperator<Double> calc = (x , y) -> { // forma mais completa podendo receber diversas sentenças de codigo e o return sendo explicitamente informado
			return x + y;
		};//usando uma interfacefuncional interna do java recebendo um DOUBLE.
		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x , y) -> x * y;//forma mais enxuta porém só pode receber 1 sentença de codigo não passa um return
		
		System.out.println(calc.apply(2.0, 3.0));
	}
}
