package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {
		DAO<Produto> dao = new DAO<>(Produto.class);
		Produto produto = new Produto("Caneta", 7.45);		
		Produto produto1 = new Produto("Notebook", 2987.78);
		Produto produto2 = new Produto("Monitor 23", 789.98);
		
		dao.abrirT().incluir(produto).fecharT().fechar();//abre a transação, inseri o produto, commita a transição, fecha o dao
		
		dao.incluirAtomico(produto1).fechar();//inclui o produto de forma mais otimizada sem precisar abrir e fechar transação
		
		dao.abrirT().incluir(produto2).fecharT().fechar();
		
		
	}
}
