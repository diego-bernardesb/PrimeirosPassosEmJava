package lambdas;

import java.util.function.Function;

public class Desafio {

	public static void main(String[] args) {
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoComDesconto = produto -> produto.preco * (1 - produto.desconto);
//		System.out.println(precoComDesconto.apply(3235.89, 0.13));
		
		Function<Double, Double> impostoMunicipal = 
				(pDesconto) -> pDesconto >= 2500 ? pDesconto + (pDesconto * 0.085): pDesconto + 0;
//	    System.out.println(precoComDesconto.andThen(impostoMunicipal).apply(3235.89, 0.13));	
	    
	    Function<Double, Double> frete = valor -> valor >= 3000 ? valor + 100: valor + 50; 
//	    System.out.println(precoComDesconto.andThen(impostoMunicipal).andThen(frete).apply(p));
	    
	    Function<Double, String> arredondamento = 
	    		saldo -> String.format("A compra do %s ficou no valor de R$%.2f.", p.nome, saldo);
   		System.out.println(
   				precoComDesconto
   				.andThen(impostoMunicipal)
   				.andThen(frete)
   				.andThen(arredondamento)
   				.apply(p));
	    
	    
		
	}
	/*
	 * 1- A partir do protudo calcular o preço real com desconto. x
	 * 2- Imposto municipal: >= 2500 (8.5%), < 2500 (isento); x
	 * 3- Frete: >= 3000 (100), < 3000 (50); x
	 * 4- Arredondar e deixar em 2 casas decimais. x
	 * 5- Formatar para imprimir R$1234,56. x
	 */
}
