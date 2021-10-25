package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac , n) -> ac + n ;
		
		Integer total1 = nums.stream().reduce(soma).get(); // precisa ser definida em uma variavel para ser chamada por um metodo print
		System.out.println(total1);
		
		Integer total2 = nums.stream().reduce(100, soma);//acumulador j� definido n�o precisa do get
		System.out.println(total2);
		
		nums.stream()
			.filter(n -> n > 5)
			.reduce(soma)
			.ifPresent(System.out::println);
	}
}
