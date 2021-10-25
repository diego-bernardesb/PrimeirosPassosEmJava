package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("JS", "PHP", "JAVA", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);//aqui é necessario fazer o cast
		System.out.println(ultimaLinguagem1);

		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1);

		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);//aqui o getUltimo2 identifica o tipo da lista e não precisa do cast
		System.out.println(ultimaLinguagem2);

		Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero2);

	}
}
