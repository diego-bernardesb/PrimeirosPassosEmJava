package generics;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {// o interrogação representa um tipo generic como referindo a qlqr
													// coisa
		return lista.get(lista.size() - 1);// retorna ultimo elemento da lista
	}

	public static <T> T getUltimo2(List<T> lista) {// define o tipo generic para que o metodo receba o tipo da lista sem
													// que precise expecificalo
		return lista.get(lista.size() - 1);
	}

}
