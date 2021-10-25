package oo.composicao;

public class Motor {

	Carro carro;	
	boolean ligado = false;
	double fatorDeInjecao = 1;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if(!ligado) {
			return 0;
		}else {
			return (int) Math.round(fatorDeInjecao * 3000);//arredonda para o valor inteiro mais proximo.
			
		}
	}
}
