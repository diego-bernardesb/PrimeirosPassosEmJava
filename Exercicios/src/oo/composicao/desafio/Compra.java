package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	double obterValorTotal() { //obtem o valor total do item
		double total = 0;
		
		for (Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
	public String toString() {
		return itens.toString();
	}
	
	
}
