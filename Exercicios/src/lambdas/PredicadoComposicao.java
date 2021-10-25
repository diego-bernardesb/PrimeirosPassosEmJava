package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 || num <= 999;
		
		System.out.println(isPar.test(98));
		System.out.println(isTresDigitos.and(isPar).negate().test(191));//teste condições feito com lambda
		System.out.println(isTresDigitos.or(isPar).test(191));
		
		
	}
}
