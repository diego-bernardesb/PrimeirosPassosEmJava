package classe;

public class PrimeiroTrauma {
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		
		PrimeiroTrauma valor = new PrimeiroTrauma();
		
		
		System.out.println(valor.a);//por a n�o ser um metodo statico � necessario instanciar uma variavel para acessalo com a nota��o ponto.
		System.out.println(b);//por b ser uma propriedade statica o metodo main pode acessalo 
	}
}
