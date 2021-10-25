package classe;

public class PrimeiroTrauma {
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		
		PrimeiroTrauma valor = new PrimeiroTrauma();
		
		
		System.out.println(valor.a);//por a não ser um metodo statico é necessario instanciar uma variavel para acessalo com a notação ponto.
		System.out.println(b);//por b ser uma propriedade statica o metodo main pode acessalo 
	}
}
