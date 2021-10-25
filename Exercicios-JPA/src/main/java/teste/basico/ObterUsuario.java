package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");//cria o entitymanager
		EntityManager em = emf.createEntityManager();//criar o usuario
		
		Usuario obterUsuario = em.find(Usuario.class, 1L);
		
		System.out.println(obterUsuario.getNome());
		
		em.close();
		emf.close();
	}
}
