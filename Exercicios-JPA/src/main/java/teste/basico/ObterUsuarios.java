package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {


	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");//cria o entitymanager
		EntityManager em = emf.createEntityManager();//criar o usuario
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario usuario: usuarios) {
			
			System.out.println("ID: "+ usuario.getId() + "Nome: "+ usuario.getNome() + "Email: "+ usuario.getEmail());
		}
		
		
		em.close();
		emf.close();
	}
}
