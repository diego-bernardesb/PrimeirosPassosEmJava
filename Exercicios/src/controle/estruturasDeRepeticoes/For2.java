package controle.estruturasDeRepeticoes;

public class For2 {
	public static void main(String[] args) {
		
		
		for(int i = 10; i >= 0; i--) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
		}
		
		for(int contador = 10; contador >= 0; contador-= 3) {
			System.out.printf("Contador = %d\n", contador);
		}
	}
}
