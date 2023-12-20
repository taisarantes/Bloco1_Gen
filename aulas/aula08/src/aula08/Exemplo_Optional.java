package aula08;

import java.util.Optional;

public class Exemplo_Optional {

	public static void main(String[] args) {
		// primeira prática com classe optional
		
		String valores[] = {"Sukuna", "Gojo"};
		
		
		// criar estrutura optional vazia
		Optional<String> opicional = Optional.empty();
		
		// criar estrutura optional com valor
		Optional<String> texto = Optional.of("Olá mundo");
		
		Optional<String> nomes = Optional.of(valores[1]);
		
		// imprimir na tela
		System.out.println(nomes);
		System.out.println(nomes.get());
		
		// verificar se o optional é vazio
		System.out.println(nomes.isEmpty());
		
		// verificar se o optional tem informação presente
		System.out.println(nomes.isPresent());
		System.out.println(opicional.isPresent());

	}

}
