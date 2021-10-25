package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	
	public static void main(String[] args) throws SQLException{
		Connection conexao = FabricaDeConexao.getConexao();
		
		String sql = "CREATE TABLE pessoas("
				+ "ID INT AUTO_INCREMENT PRIMARY KEY,"
				+ "NOME VARCHAR(90) NOT NULL"
				+ ");";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		System.out.println("Tabela criada com sucesso");
		conexao.close();
	}
}
