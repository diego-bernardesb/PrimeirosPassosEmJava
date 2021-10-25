package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");//cria o entitymanager
			EntityManager em = emf.createEntityManager();//criar o usuario
			
			Usuario usuario = em.find(Usuario.class, 6L);//consulta no banco
			
			if(usuario != null) {
				em.getTransaction().begin();
				em.remove(usuario);
				em.getTransaction().commit();
			}
			
			em.close();
			emf.close();
	}
}
