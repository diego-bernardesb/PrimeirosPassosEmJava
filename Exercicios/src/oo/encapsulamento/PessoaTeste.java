package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Diego", "Bernardes", 28);
		
		p1.setIdade(-229); //altera
		
		System.out.println(p1.getIdade()); //ler
		System.out.println(p1.getNomeCompleto());
		System.out.println(p1);
		
	}
}
