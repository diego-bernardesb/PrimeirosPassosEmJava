package generics;

public class Caixa<T> {// definir um tipo na classe torna ela mais generica e flexivel para uso sem a
					   // necessidade de cast explicitos definido geralmente por 1 letra em maiusculo

	private T coisa;

	public void guardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}
}
