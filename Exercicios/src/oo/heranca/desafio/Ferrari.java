package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari(){
		this(315);// Velocidade maxima padrão caso não seja informado
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima); //velocidade maxima vai ser recebida por parametro
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;		
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;		
	}
	
	@Override
	public int getDelta() {
		
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && ligarAr) {
			return 10;
		} else {
			return 15;			
		}		
		
	}
	
	
	
	
//	para sobreescrever um metodo o nivel de visibilidade não pode ser diminuido deve ser mantido o msm ou aumentado
//	@Override //indica que está sobreescrevendo o metotodo da classe pai
//	protected void acelerar() {		
//		
//		velocidadeAtual += 15;		
//		
//	}

}
