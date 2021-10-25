package excecao;

public class ChecadaVsNaoChegada {

	public static void main(String[] args) {
		
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("\nFim... :)");
		
	}
	
	//Exce��o N�O chegada ou N�O verificada
	static void geraErro1() {//n�o necessita tratar o erro
		throw new RuntimeException("Ocorreu um erro bem legal #01...");
	}

	//Exce��o chegada ou verificada
	static void geraErro2() throws Exception {//obrigatoriamente deve ser explicito que � um throws Execption, e tratar o erro
		throw new Exception("Ocorreu um erro bem legal #02...");
	}
	
}
