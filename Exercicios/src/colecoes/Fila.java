package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//add e offer -> adicionam elementos a fila
		
		//A diferen�a � o comportamento que ocorre com a fila cheia.
		fila.add("Ana");//retorna uma exce��o caso a fila esteja cheia.
		fila.offer("Bia");//retorna false caso a fila esteja cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//funciona de forma seguindo o FIFO"first in first out" sendo o primeiro elemento o primeiro a sair 

		
		//Peek e Element -> pega o proximo elemento da fila (sem remover).
		
		//Se n�o ouver proximo elemento se comportam de maneiras diferentes
		System.out.println(fila.peek());//retorna null caso n�o tenha proximo elemento.
		System.out.println(fila.peek());
		System.out.println(fila.element());//retorna uma exce��o caso n�o tenha proximo elemento.
		System.out.println(fila.element());
		
		
		
		System.out.println(fila.poll()); //pega o proximo elemento da fila, e remove para chamar o proximo
		System.out.println(fila.remove()); //tbm pega o proximo elemento da fila e remove
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); 
		System.out.println(fila.poll()); //quando n�o h� proximo elemento lan�a null
		System.out.println(fila.remove()); //quando a fila estiver vazia lan�a uma exce��o(ERRO)
		
		
		//fila.size(); Tamanho da fila
		//fila.clear(); limpa a fila
		//fila.isEmpty(); saber se a fila est� vazia
		//fila.contains(...);saber se o objeto est� contido
		
	}
}
