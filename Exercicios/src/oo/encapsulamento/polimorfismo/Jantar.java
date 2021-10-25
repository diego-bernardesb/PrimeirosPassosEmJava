package oo.encapsulamento.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Comida ingrediente1 = new Arroz(0.2);
		Comida ingrediente2 = new Feijao(0.1);
		Comida sobremesa = new Sorvete(0.4);
		
		System.out.println("O peso inicial é de " +convidado.getPeso() + " Kg.");
		
		convidado.Comer(ingrediente1);
		convidado.Comer(ingrediente2);
		
		System.out.println("O peso atual é de " +convidado.getPeso() + " Kg.");
		
		convidado.Comer(sobremesa);
		
		System.out.println("O peso atual é de " +convidado.getPeso() + " Kg.");
		
	}
}
