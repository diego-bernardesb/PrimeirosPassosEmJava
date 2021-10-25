package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado1 = maisDois //o andThen faz uma sequencia um apois o outro
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);		
		
		int resultado2 = aoQuadrado //o compose faz uma sequencia reversa execurando antes o compose
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
	}
}
