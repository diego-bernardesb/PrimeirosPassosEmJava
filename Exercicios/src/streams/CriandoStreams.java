package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ","JS\n");//stream.of cria um array
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print); //cria uma stream apartir de um array já criado
		Arrays.stream(maisLangs).forEach(print); //passa o array para criar uma stream
		Arrays.stream(maisLangs, 1 , 3).forEach(print);//define os indicies a ser exibidos aceita o primeiro indicie definido, até o ultimo indicie definido -1;
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print); //cria uma stream
		outrasLangs.parallelStream().forEach(print);//cria uma stream de forma paralela e podendo mudar a ordem dos indicies do array
		
//		Stream.generate(() -> "ai ").forEach(print); // gera um stream infinita
		Stream.iterate(0, n -> n + 1).forEach(println); // tbm gera uma stream infinita de forma que segue uma sequencia.
		
		
		
	}
}
