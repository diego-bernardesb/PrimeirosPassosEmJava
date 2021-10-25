package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto () {
		
	}
	
	Produto(String nomeInicial, double precoInical){
		nome = nomeInicial;
		preco = precoInical;
		
	}
	
	double precoComDesconto () {//n�o recebe parametro
		return preco * (1 - desconto);
	}
 
	double precoComDesconto (double descontoDoGerente) {//recebe um parametro n�o programado que � atribuido na hora
		return preco * (1 - desconto + descontoDoGerente);
	}
}
