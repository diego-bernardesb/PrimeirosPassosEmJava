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
	
	//Exceção NÃO chegada ou NÃO verificada
	static void geraErro1() {//não necessita tratar o erro
		throw new RuntimeException("Ocorreu um erro bem legal #01...");
	}

	//Exceção chegada ou verificada
	static void geraErro2() throws Exception {//obrigatoriamente deve ser explicito que é um throws Execption, e tratar o erro
		throw new Exception("Ocorreu um erro bem legal #02...");
	}
	
}
