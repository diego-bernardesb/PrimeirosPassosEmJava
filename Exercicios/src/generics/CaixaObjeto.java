package generics;

public class CaixaObjeto {// como a classe n�o teve um tipo generic definido � necessario utilizar um tipo
						  // primitivo tornando a classe muito expecifica

	private Object coisa;

	public void guardar(Object coisa) {
		this.coisa = coisa;
	}

	public Object abrir() {
		return coisa;
	}
}
