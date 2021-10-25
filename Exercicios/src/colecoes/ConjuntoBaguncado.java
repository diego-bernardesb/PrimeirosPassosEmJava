package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })//um metodo forçado de retirar as advertencias
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		//adicionando 
		conjunto.add(1.2); //converte do (primitivo)double -> (classe)Double
		conjunto.add(true); //converte do (primitivo)boolean -> (classe)Boolean
		conjunto.add("teste"); //String -> já é um objeto
		conjunto.add(1); //converte do (primitivo)int -> (classe)Integer
		conjunto.add('x'); //converte do (primitivo)char -> (classe)Character
		
		
		conjunto.add("teste");//não adiciona item com o msm valor interno
		conjunto.add("Teste");//por se escrito de outra forma ele adiciona o hashcode
		
		//consultando
		
		System.out.println("O tamanho do conjunto é " + conjunto.size());//tamanho do conjunto
		
		System.out.println(conjunto.contains(1.2));//retorna um boolean para confirmar se o valor esta contido no conjunto
		
		//remeovendo
		
		System.out.println(conjunto.remove("teste"));//quando removido retorna um valor boolean true(removido) false(não removido)
		System.out.println("O tamanho do conjunto é " + conjunto.size());//tamanho do conjunto
		
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//União
//		conjunto.addAll(nums);//junta os 2 conjutos, ainda sem duplicar os dados já existentes
		
		//interceção
		conjunto.retainAll(nums); //mantem apenas os dados iguais em cada um dos conjuntos

		System.out.println(conjunto);
		
		//limpando
		conjunto.clear();//apaga todo o conjunto esvaziando por completo
		
		
		System.out.println(conjunto);
	}
}
