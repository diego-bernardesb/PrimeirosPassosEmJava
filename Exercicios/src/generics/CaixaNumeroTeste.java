package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Double> caixa1 = new CaixaNumero<>();//necessita apenas da definição do tipo quando instancia a classe
		caixa1.guardar(1234.0);//recebe apenas numeros double e não faz o cast automatico de int para double
		System.out.println(caixa1.abrir());

		CaixaNumero<Integer> caixa2 = new CaixaNumero<>();
		caixa2.guardar(1234);
		System.out.println(caixa2.abrir());
	}
}
