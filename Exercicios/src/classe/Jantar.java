package classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("José", 73.5);
		
		Comida c1 = new Comida("Arroz", 0.150);
		Comida c2 = new Comida("Feijão", 0.190);
		Comida c3 = new Comida("Frango", 0.250);
		
		System.out.println(p1.apresentar());
		p1.Comer(c1);
		p1.Comer(c2);
		p1.Comer(c3);
		System.out.println(p1.apresentar());
		
		
	}
}
