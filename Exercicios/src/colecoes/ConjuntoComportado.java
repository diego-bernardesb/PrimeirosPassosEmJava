package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
//		Set<String> listaAprovados = new HashSet<String>();//Tornamos o set expecifico para o tipo string
		Set<String> listaAprovados = new TreeSet<String>();//Torna a leitura da lista ordenada		
		
		listaAprovados.add("Diego");
		listaAprovados.add("Ana");
		listaAprovados.add("Pedro");
		listaAprovados.add("João");
		listaAprovados.add("Clara");
		
		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		System.out.println("");
		
		Set<Integer> nums = new HashSet<>();//tbm é possivel informar o tipo da lista apenas pelo set
		
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(200);
		
		for (Integer n : nums) {
			System.out.println(n);
		}
	}
}
