package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

		
		System.out.println("Distinct...");//precisa do equal/hashcode para destinguir cada elemento
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit...");//pula e limita quantidade de elementos
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(3)
			.forEach(System.out::println);

		System.out.println("\nTakeWhile...");//pegue elemento enquanto obedecer uma condi��o
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7) //enquanto nota >= 7 imprima o aluno, e para quando o proximo elemento n�o atende a condi��o
		.forEach(System.out::println);
		
	}
}
