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
	
	double precoComDesconto () {//não recebe parametro
		return preco * (1 - desconto);
	}
 
	double precoComDesconto (double descontoDoGerente) {//recebe um parametro não programado que é atribuido na hora
		return preco * (1 - desconto + descontoDoGerente);
	}
}
