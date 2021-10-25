package tarefa;

import infra.DAO;

public class TestePessoas {

	public static void main(String[] args) {
		
		DAO<Pessoa> dao = new DAO<>();
		
		Pessoa pessoa = new Pessoa("Rodolfo");
		PessoaFisica cpf = new PessoaFisica("Diego","12345678900");
		PessoaJuridica cnpj = new PessoaJuridica("Material de construção","12345678/0001-00");
		
		dao.abrirT().incluir(cpf).incluir(cnpj).incluir(pessoa).fecharT().fechar();
	}
}
