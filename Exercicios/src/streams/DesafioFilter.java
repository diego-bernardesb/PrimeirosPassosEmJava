package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Diego", 32920.89, 1);
		Funcionario f2 = new Funcionario("Pedro", 28930.68, 0);
		Funcionario f3 = new Funcionario("Ana", 38930.23, 3);
		Funcionario f4 = new Funcionario("Bia", 23920.18, 1);
		Funcionario f5 = new Funcionario("Leandro", 24320.34, 0);
		Funcionario f6 = new Funcionario("Carlos", 33430.43, 0);

		Consumer<String> print = System.out::println;

		List<Funcionario> funcionarios = Arrays.asList(f1, f2, f3, f4, f5, f6);
		Predicate<Funcionario> falta = v -> v.faltaNoMes < 3;
		Predicate<Funcionario> metaMax = v -> v.venda >= 25000.00 ;
		Function<Funcionario, String> bonificacao = v -> "Parabéns " + v.nome +" recebeu um bonus de 10%.";
		
		funcionarios.stream()
			.filter(metaMax)
			.filter(falta)
			.map(bonificacao)
			.forEach(print);

	}
}
