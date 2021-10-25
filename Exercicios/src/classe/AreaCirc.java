package classe;

public class AreaCirc {
	double raio;
	final static double pi = 3.1415;//"final"torna a pi constante de forma que não vai ser auterada, e static torna pi uma propriedade da classe e não do objeto.
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area(){
		return pi * Math.pow(raio, 2);
	}
	
	static double area(double raio) {//metodo statico que não necessita de instanciar um novo objeto para calcular a area
		return pi * Math.pow(raio, 2);
	}
}
