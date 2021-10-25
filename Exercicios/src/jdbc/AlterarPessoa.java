package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaDeConexao.getConexao();
		Scanner entrada = new Scanner(System.in);

		String sqlUPTADE = "UPDATE pessoas SET NOME = ? WHERE ID = ?";
		String sqlSELECT = "SELECT ID, NOME FROM pessoas WHERE ID = ?";

		System.out.print("Informe o ID da pessoa para alterar o nome: ");
		String id = entrada.nextLine();
		PreparedStatement stmt = conexao.prepareStatement(sqlSELECT);
		stmt.setString(1, id);
		ResultSet relatorio = stmt.executeQuery();

		if (relatorio.next()) {

			Pessoa p = new Pessoa(relatorio.getInt(1), relatorio.getString(2));
			
			System.out.println("O nome atual é " + p.getNome());
			
			System.out.print("Informe o novo nome: ");
			String nome = entrada.nextLine();

			stmt.close();
			stmt = conexao.prepareStatement(sqlUPTADE);
			stmt.setString(1, nome);
			stmt.setString(2, id);

			stmt.execute();

			System.out.println("Nome alterado com sucesso!");
		} else {
			System.out.println("ID não encontrado!");
		}

		entrada.close();
		conexao.close();

	}
}
