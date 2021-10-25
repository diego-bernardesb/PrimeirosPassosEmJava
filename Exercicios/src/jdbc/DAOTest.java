package jdbc;

public class DAOTest {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "João da Silva");
		dao.incluir(sql, "Anderson da Araujo");
		dao.incluir(sql, "Artur da Silva e Souza");
	}
}
 