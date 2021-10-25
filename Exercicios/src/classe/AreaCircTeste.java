package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		System.out.println(a1.area());
		
//		AreaCirc a2 = new AreaCirc(5.5);		
		System.out.println(AreaCirc.area(5.5));//utilizando o metodo statico não é preciso instanciar a2 para usar o metodo
		
	}
}
