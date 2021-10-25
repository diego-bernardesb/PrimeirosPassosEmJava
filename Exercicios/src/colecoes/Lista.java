package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
				
		Usuario u1 = new Usuario("Manu");
		lista.add(u1);
				
		lista.add(new Usuario("Diego"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Carlos"));
		
		System.out.println(lista.get(1));//acessa a lista pelo indicie
		System.out.println("------------");
		System.out.println(lista.remove(3) + " foi removida da lista.");//remove da lista pelo indicie e passando o valor que foi excluido
		System.out.println(lista.remove(new Usuario("Lia")));//Remove da lista pelo objeto trazendo o valor booleano
		System.out.println("------------");
		System.out.println("Na lista tem ? " + lista.contains(new Usuario("Ana")));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
