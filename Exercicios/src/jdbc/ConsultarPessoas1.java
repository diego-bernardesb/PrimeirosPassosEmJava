package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaDeConexao.getConexao();
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = conexao.createStatement();
		
		ResultSet relatorio = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while(relatorio.next()) {
			int id = relatorio.getInt("id");
			String nome = relatorio.getString("nome");
			pessoas.add(new Pessoa(id, nome));
		}
		
		for (Pessoa p : pessoas) {
			System.out.println(p.getId() + " -> " + p.getNome());
		}
		
		
		
		stmt.close();
		conexao.close();
	}
}
