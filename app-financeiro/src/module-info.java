module app.financeiro {
	requires java.base;//module import default 
//	requires app.calculo;//precisa informar de qual modulo vai ser importado
	requires app.api;//importa a api
	uses br.com.diiego.app.Calculadora;//define onde será usado
}