package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		Filme filme1 = new Filme("Star War ep 4", 8.9);
		Filme filme2 = new Filme("O fugitivo", 8.1);
		
		Ator ator1 = new Ator("Harrison Ford");
		Ator ator2 = new Ator("Carrie Fisher");
		
		filme1.addAtor(ator1);
		filme1.addAtor(ator2);
		
		filme2.addAtor(ator1);
		
		DAO<Filme> dao = new DAO<Filme>();
		
		dao.incluirAtomico(filme1);
		
	}
}
