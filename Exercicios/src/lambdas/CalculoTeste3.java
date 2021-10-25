package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		//caso a interface n�o seja funcional n�o � possivel utilizar functions lambdas
		BinaryOperator<Double> calc = (x , y) -> { // forma mais completa podendo receber diversas senten�as de codigo e o return sendo explicitamente informado
			return x + y;
		};//usando uma interfacefuncional interna do java recebendo um DOUBLE.
		
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x , y) -> x * y;//forma mais enxuta por�m s� pode receber 1 senten�a de codigo n�o passa um return
		
		System.out.println(calc.apply(2.0, 3.0));
	}
}
