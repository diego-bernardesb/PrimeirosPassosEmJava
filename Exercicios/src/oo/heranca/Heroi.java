package oo.heranca;

public class Heroi  extends Jogador{
//HERDA as propriedades da classe jogador
	
	public Heroi(int x, int y){ //herda o construtor definido na classe pai quando o construtor padrão não é explicito na classe pai
		super(x, y);
	}
	
	public boolean atacar(Jogador oponente) {
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		return ataque1 || ataque2 || ataque3;
	}
	
}
