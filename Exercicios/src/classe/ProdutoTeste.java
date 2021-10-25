package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;//agora o desconto é aplicado a classe logo aplicando a todos os produtos.
		
		double precoFinal1 = p1.precoComDesconto(); //chama o primeiro metodo sem receber parametero
		double precoFinal2 = p2.precoComDesconto(0.15);//chama o segundo metodo que recebe o parametero
		double valorFinal = precoFinal1 + precoFinal2;		
		
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		System.out.printf("O valor final é de R$ %.2f", valorFinal);
	}
}
