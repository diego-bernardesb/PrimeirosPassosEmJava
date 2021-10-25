package controle.operadores;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		//Desafio Logico
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		
		
		if(trabalhoTerca && trabalhoQuinta) {
			System.out.println("Vamos ao shopping comprar uma TV 50' e tomar sorvete");
		} else if(trabalhoTerca || trabalhoQuinta) {
			System.out.println("Vamos ao shopping comprar uma TV 32' e tomar sorvete");
		} else {
			System.out.println("Não vamos tomar sorvete hoje para mantermos um estilo de vida mais saudavel");
		}
	}
}
