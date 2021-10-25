package excecao;

public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try { //try se o bloco receber um erro
			imprimir(a1);			
		} catch (Exception e) { // excecute o bloco catch -> que imprime a mensagem de erro ou uma mensagem personalizada
			System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
		}
		
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {//se o catch estiver vazio o erro está sendo silenciado e não apresentando nenhuma mensagem
			//e.printStackTrace();//pilha de excecução em qual ponto ocorreu o problema no codigo.
			System.out.println("Ocorreu o erro: " + e.getMessage());
		}
		
		System.out.println("Fim ;)");
		
	}
	
	public static void imprimir(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
