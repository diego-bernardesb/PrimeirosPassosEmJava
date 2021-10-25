package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{

	private String nomeDoAtributo;
	//exception criada para tratar atributo negativo
	public NumeroNegativoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		
		return String.format("O atributo '%s' está negativo.", nomeDoAtributo);
	}
}
