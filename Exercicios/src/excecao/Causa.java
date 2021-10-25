package excecao;

public class Causa {

	public static void main(String[] args) {

		try {
			metodoA(null);
		} catch (Exception e) {
			if(e.getCause() != null) {//mostra a causa do erro
				System.out.println(e.getCause().getMessage());
			}
		}

		metodoA(null);
	}

	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);//recebe o parametro do catch para definir o erro
		}
	}

	static void metodoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno está NULLLOOOOOO!!!");
		}

		System.out.println(aluno.nome);
	}
}
