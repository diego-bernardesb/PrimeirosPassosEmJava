package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		CaixaInt caixa = new CaixaInt();

		caixa.guardar(123455);
//		caixa.guardar("Hello World!");//msm herdando de uma classe generic o tipo foi definido apartir da heranca
									  //e assim só conseguindo receber dados de valores inteiros

		Integer coisa = caixa.abrir();
		System.out.println(coisa);
	}
}
