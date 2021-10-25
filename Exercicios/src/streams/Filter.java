package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 9.8);
		Aluno a2 = new Aluno("Bia", 7.8);
		Aluno a3 = new Aluno("Daniel", 4.8);
		Aluno a4 = new Aluno("Gui", 5.2);
		Aluno a5 = new Aluno("Rebeca", 6.4);
		Aluno a6 = new Aluno("Pedro", 9.2);

		Consumer<Object> print = System.out::println;

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> saudacao = a -> "Parabéns " + a.nome + " você está aprovado(a) !";
		
		alunos.stream()
			.filter(aprovado) //filtra todos os campos que atendem a condição criando uma nova array
			.map(saudacao)
			.forEach(print);

	}
}
