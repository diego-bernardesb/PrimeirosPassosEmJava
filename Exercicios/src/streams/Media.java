package streams;

public class Media {

	private double total;
	private double quantidade;
	
	public Media adicionar(double valor) { //receba o valor
		total += valor; //some valor ao total
		quantidade++; //mais a quantidade
		return this; //retorne a media
	}
	
	public double getValor() {
		return total/quantidade;
		
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
	
}
