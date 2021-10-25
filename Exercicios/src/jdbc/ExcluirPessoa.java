package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaDeConexao.getConexao();
		String sqlSELECT = "SELECT id, nome FROM pessoas WHERE ID = ?";
		String sqlDELETE = "DELETE FROM pessoas WHERE ID = ?";
		
		System.out.print("Informe o ID que deseja deletar: ");
		int selectId = entrada.nextInt();
		
		
		PreparedStatement stmt = conexao.prepareStatement(sqlSELECT);
		stmt.setInt(1, selectId);
		ResultSet relatorio = stmt.executeQuery();
		if(relatorio.next()) {
			Pessoa p = new Pessoa(relatorio.getInt(1), relatorio.getString(2));
			
			System.out.println("\nDeseja deletar o registro:\n" + p.getNome() + ", de ID " + p.getId());
			stmt.close();
			System.out.print("\nConfirme o ID para deletar o registro: ");
			int deleteId = entrada.nextInt();
			if(deleteId == selectId) {
			stmt = conexao.prepareStatement(sqlDELETE);
			stmt.setInt(1, deleteId);
			stmt.execute();
			stmt.close();
			System.out.println("Registro escluido com sucesso!");
			} else {
				System.out.println("ID não confere com registro selecionado, tente novamente!");
			}
			
		} else {
			System.out.println("ID invalido!");
		}
		entrada.close();
	}
}
