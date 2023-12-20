package aula08;

import java.util.Arrays;
import java.util.List;

public class Exemplo_Lambda {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
		
		// percorrer a lista com for each normal
		for(Integer num : numeros) {
			System.out.println(num);
		}
		
		// utilizando o for each com lambda para percorrer a lista
		System.out.println("Utilizando lambda: ");
		numeros.forEach(num -> System.out.println(num));

	}

}
