package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		aluno1.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso1);

		aluno2.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso2);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		for(Aluno aluno: curso3.alunos ) {
			System.out.println("Estou matriculado no curso " + curso3.nome + "...");
			System.out.println("... E meu nome é " + aluno.nome);
		}
		System.out.println("");
		System.out.println(aluno2.cursos.get(2).nome);		
	
	}
}
