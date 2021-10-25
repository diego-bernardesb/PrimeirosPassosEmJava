package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");//cria o entitymanager
		EntityManager em = emf.createEntityManager();//criar o usuario
		
		@SuppressWarnings("unused")
		Usuario novoUsuario = new Usuario("Diego", "Diegobernardes@gmail.com");
		@SuppressWarnings("unused")
		Usuario novoUsuario2 = new Usuario("Ana", "anaf.d@gmail.com");
		@SuppressWarnings("unused")
		Usuario novoUsuario3 = new Usuario("Guilherme", "araujo.guilherme@gmail.com");
		@SuppressWarnings("unused")
		Usuario novoUsuario4 = new Usuario("Maria", "maria@maria.com.br");
		Usuario novoUsuario5 = new Usuario("Lea", "lea.adm@gmail.com");
		
		em.getTransaction().begin();//indica que será feita a transição pro bango de dados
		em.persist(novoUsuario5);
		em.getTransaction().commit();//envia o persist para o banco de dados
		
		em.close();
		emf.close();
	}
}
