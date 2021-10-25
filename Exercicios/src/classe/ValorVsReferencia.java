package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;//atribui��o por valor (tipo primitivo).
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,11,2021);
		Data d2 = d1;//atribui��o por referencia (Objeto)
		
		d1.dia = 15;
		d2.mes = 3;		
		d1.ano = 2026;
		//com as atribui��es de referencia independente de qual data for alterada a referencia � aplicada a todas as datas que utilizam a msm referencia
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
}
