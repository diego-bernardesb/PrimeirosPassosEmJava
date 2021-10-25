package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserrPessoas {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaDeConexao.getConexao();
		
		System.out.print("Informo o nome: ");
		String nome = entrada.nextLine();
		
		String sql = "INSERT INTO pessoas (NOME) VALUES (?)";//só é possivel usar parametros utilizando o PreparedStatement
		PreparedStatement stmt = conexao.prepareStatement(sql);//recebe o codigo SQL
		stmt.setString(1, nome);//seleciona o parametro e insere no codigo SQL, evita o uso de concatenação e evita ataques de SQLinjection
		
		stmt.execute();//executa o comando
		
		System.out.println("Cadastro incluido com sucesso!");
		conexao.close();		
		entrada.close();
	}
}
