import br.com.diiego.app.Calculadora;
import br.com.diiego.app.calculo.CalculadoraImpl;

module app.calculo {
	exports br.com.diiego.app.calculo;//é necessario informar qual pacote vai ser exportado
	requires transitive app.logging;//torna a require transitiva pra outros modulos que vão usar essa dependencia
	
	exports br.com.diiego.app.calculo.interno
		to app.financeiro; //abre a oportunidade para que o modulo financeiro acessar as classes internas de calculo. possivel colocar mais de um modulo separado por virgura
	
	requires app.api;
	provides Calculadora
		with CalculadoraImpl;
	
}