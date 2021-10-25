package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		Data d2 = new Data(29, 1, 2028);
		
		
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
}
