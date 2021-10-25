package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");//cria o entitymanager
		EntityManager em = emf.createEntityManager();//criar o usuario
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);//identifica o usuario
		usuario.setNome("Ana Flávia");//altera os dados
		usuario.setEmail("ana-flavia.d@gmail.com");//altera os dados

		em.merge(usuario);//identifica o usuario alterado para sobreescrever no banco
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
