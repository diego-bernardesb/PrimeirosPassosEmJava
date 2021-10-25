package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaDeConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?;";

		System.out.print("Buscar pessoa: ");
		Scanner entrada = new Scanner(System.in);

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + entrada.nextLine() + "%");
		ResultSet relatorio = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		while (relatorio.next()) {
			int id = relatorio.getInt("id");
			String nome = relatorio.getString("nome");
			pessoas.add(new Pessoa(id, nome));
		}

		System.out.println("");
		System.out.println("Os nomes encontrados sao:\n");
		for (Pessoa p : pessoas) {
			System.out.println(+p.getId() + " -> " + p.getNome());
		}

		stmt.close();
		entrada.close();
		conexao.close();
	}
}
