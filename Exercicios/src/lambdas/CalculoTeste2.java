package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		//caso a interface n�o seja funcional n�o � possivel utilizar functions lambdas
		Calculo calc = (x , y) -> { // forma mais completa podendo receber diversas senten�as de codigo e o return sendo explicitamente informado
			return x + y;
		};
		
		System.out.println(calc.executar(2, 3));
		
		calc = (x , y) -> x * y;//forma mais enxuta por�m s� pode receber 1 senten�a de codigo n�o passa um return
		
		System.out.println(calc.executar(2, 3));
	}
}
