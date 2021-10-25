package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro Monstro = new Monstro();
		Heroi Heroi = new Heroi(10, 11);
		
		Monstro.x = 10;
		Monstro.y = 10;
		
		System.out.println(Monstro.vida);
		System.out.println(Heroi.vida);
		
		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		System.out.println(Monstro.vida);
		System.out.println(Heroi.vida);
		
		Monstro.andar(Direcao.SUL);
		Monstro.atacar(Heroi);
		Heroi.atacar(Monstro);
		
		System.out.println(Monstro.vida);
		System.out.println(Heroi.vida);
		
	}
}
