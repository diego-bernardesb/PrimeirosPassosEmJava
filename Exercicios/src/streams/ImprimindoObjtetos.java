package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjtetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Lu", "Gui", "Luca");
		
		System.out.println("Usando ForEach...");
		for (String nome : aprovados) { //laço for comum
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {//itera usando e hasNext perguntando se a proximo
			System.out.println(iterator.next());//limita a para se não ouver proximo
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); //faz o laço internamente e usa o method reference para imprimir na tela
		
	}
}
