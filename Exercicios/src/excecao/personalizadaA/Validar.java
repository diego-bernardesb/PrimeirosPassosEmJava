package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

	private Validar() {
	}

	public static void aluno(Aluno aluno) {

		if (aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");//exception propria do java
		}

		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");//exception criada
		}
		
		if(aluno.nota < 0 || aluno.nota >10) {
			throw new NumeroNegativoException("nota");//exception criada
		}
	}
}
