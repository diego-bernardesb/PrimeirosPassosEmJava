package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {

	private final Set<Par<C, V>> itens = new LinkedHashSet<>();//garante a ordem de inclusão
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return; //o return sai do metodo pois a condição foi cumprida.
		
		Par<C, V> novoPar = new Par<C, V>(chave, valor);//gera um novo par
		
		if(itens.contains(novoPar)) {//verifica se contem a mesma chave
			itens.remove(novoPar);//removo se a condição for cumprida
		}
		
		itens.add(novoPar);//adiciona um novo par
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOpicional = itens.stream().filter(par -> chave.equals(par.getChave())).findFirst();
		
		return parOpicional.isPresent() ? parOpicional.get().getValor() : null;
	}
}
