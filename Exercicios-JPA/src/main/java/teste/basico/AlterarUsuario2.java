package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");//cria o entitymanager
		EntityManager em = emf.createEntityManager();//criar o usuario
		
		
		Usuario usuario = em.find(Usuario.class, 2L);//identifica o usuario
		usuario.setNome("Ana Fl�via");//altera os dados
		usuario.setEmail("ana-flavia.d@gmail.com");//altera os dados

		em.getTransaction().begin();//msm retirando da ordem de prioridade � feita a execu��o da transa��o
		//em.merge(usuario);//msm n�o usando o comando merge � feita a altera��o no banco - o objeto fica em estado gerenciado
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
