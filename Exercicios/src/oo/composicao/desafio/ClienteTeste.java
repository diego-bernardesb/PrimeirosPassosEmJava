package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Diego");
		
		Produto p1 = new Produto("Caneta", 4.75);
		Produto p2 = new Produto("Lapís", 2.35);
		Produto p3 = new Produto("Borracha", 3.15);
		Produto p4 = new Produto("Caderno", 19.95);
		
		Compra compra1 = new Compra();
		compra1.itens.add(new Item(p1, 10));
		compra1.itens.add(new Item(p4, 5));
		
		Compra compra2 = new Compra();
		compra2.itens.add(new Item(p2, 30));
		compra2.itens.add(new Item(p3, 30));
		
		c1.listaDeCompra(compra1);
		c1.listaDeCompra(compra2);
		
		System.out.println(c1.obeterValorTotal());
		
		System.out.println(compra2.itens.toString());
		
	}
}
