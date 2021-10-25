package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");//cria o entitymanager
		EntityManager em = emf.createEntityManager();//criar o usuario
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);//identifica o usuario
		em.detach(usuario);//tira o objeto de estado gerenciado
		//com o uso do detach as atulizações no banco de dados só serão relazadas caso o merge esteja presente de forma esplicita
		
		
		usuario.setNome("Ana Flávia");//altera os dados
		em.merge(usuario);//identifica o usuario alterado para sobreescrever no banco
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
