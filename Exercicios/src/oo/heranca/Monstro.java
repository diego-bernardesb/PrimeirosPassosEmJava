package oo.heranca;

public class Monstro extends Jogador{
//HERDA as propriedades da classe jogador
	
	public Monstro() { //simula o construtor padrão da classe pai, e herda do metodo criado na msm classe herdado da classe pai
		this(0, 0);
	}
	
	public Monstro(int x, int y) {
		super(x, y);
	}
	
}
