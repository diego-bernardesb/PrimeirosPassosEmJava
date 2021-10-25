package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");//lança true ou false
		livros.push("Don Quixote");//retorna um erro caso a pilha tenha limitações
		livros.push("Hobbit");
		
		//funciona de forma seguindo o FILO"first in last out" sendo o ultimo elemento o primeiro a sair 
		
//		System.out.println(livros.peek());
//		System.out.println(livros.element());
//		
//		System.out.println(livros.poll());
//		System.out.println(livros.remove());
//		System.out.println(livros.remove());
//		System.out.println(livros.poll());
//		System.out.println(livros.pop());//funciona semelhante ao remove gerando uma exceção
		
		for(String livro : livros) {
			System.out.println(livro);
		}
	
	}
}
