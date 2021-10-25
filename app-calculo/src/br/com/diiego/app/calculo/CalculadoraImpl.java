
package br.com.diiego.app.calculo;

import br.com.diiego.app.Calculadora;
import br.com.diiego.app.calculo.interno.OperacoesAritimeticas;
import br.com.diiego.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{
	
	private OperacoesAritimeticas op = new OperacoesAritimeticas();

	public double somar(double... nums) {
		Logger.info("O valor da conta atual é de: ");
		return op.somar(nums);
	}
	
	

}
