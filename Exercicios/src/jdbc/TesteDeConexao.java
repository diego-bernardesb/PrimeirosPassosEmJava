package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeConexao {

	public static void main(String[] args) throws SQLException{
//		verficar o certificado se torna falso p/não ser verificado & useSSL se torna verdade para ter um conexao segura 
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";//indica qual bd está sendo usado e a porta usada
		final String usuario = "root";
		final String senha = "123456";

		Connection conexao = DriverManager.getConnection(url, usuario, senha);//interface que faz a coneção com bd e o driver que recebe os dados para conexão 

		System.out.println("conexao efetuada com sucesso!");
		conexao.close();//fecha a conexão
	}
}
