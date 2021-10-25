package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + " !!!");
		
		Produto p1 = new Produto("Caneta", 12.50, 0.09);
		Produto p2 = new Produto("Notebook", 2928.90, 0.25);
		Produto p3 = new Produto("Caderno", 21.80, 0.19);
		Produto p4 = new Produto("Borracha", 7.40, 0.18);
		Produto p5 = new Produto("Lapis", 4.20, 0.03);
		
		imprimirNome.accept(p1);
		System.out.println("");
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		System.out.println("");
		produtos.forEach(p -> System.out.println("R$" +p.preco));
		System.out.println("");
		produtos.forEach(p -> System.out.printf("O produto %s tem o preço de R$%.2f%n", p.nome, p.preco *(1- p.desconto)));
		System.out.println("");
		produtos.forEach(System.out::println);
		
		
		
		
		
	}
}
