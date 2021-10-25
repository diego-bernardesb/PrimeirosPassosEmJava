package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");//.put addiciona ou altera 
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());//não duplica dados
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());//retorna as chaves
		System.out.println(usuarios.values());//retorna os valores
		System.out.println(usuarios.entrySet());//retorna chave e valor
		
		System.out.println(usuarios.containsKey(3));//verifica se contem a chave 
		System.out.println(usuarios.containsValue("Ricardo"));//verifica se contem o valor(Não ignora o case das letras R != r)
		
		System.out.println(usuarios.get(4));//busca atraves da chave
		
		for (int chave : usuarios.keySet()) {//percorre todas as chaves do map
			System.out.println(chave);
		}
		
		for (String usuario : usuarios.values()) {//percorre todos os valores do map
			System.out.println(usuario);
		}
		
		for (Entry<Integer, String> registro : usuarios.entrySet()) { //percorre valores e chaves ao mesmo tempo
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
		
	}
}
