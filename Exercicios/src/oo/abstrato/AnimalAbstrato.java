package oo.abstrato;

public class AnimalAbstrato{

	public static void main(String[] args) {
		
		Mamifero a1 = new Cachorro();
		
		System.out.println(a1.mover());
		System.out.println(a1.mamar()); //para utilizar o metodo mamar, s� � possivel quando o cachorro � instanciado apartir de um mamifere que � quem tem este metodo
		System.out.println(a1.respirar());
	}
}
