package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriandoBanco {

	public static void main(String[] args) throws SQLException {
	
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "afjkds854";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE CURSO_JAVA;");		

		System.out.println("Banco criado com sucesso!");
		conexao.close();//fecha a conexão
	}
}
