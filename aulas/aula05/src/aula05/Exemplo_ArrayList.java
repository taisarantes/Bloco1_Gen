package aula05;

import java.util.ArrayList;
import java.util.Iterator;

public class Exemplo_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exemplo de uso de List
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Gabrielle");
		nomes.add("Aline");
		nomes.add("Dani");
		nomes.add("Lucas");
		
		System.out.println(nomes);
		
		System.out.println(nomes.indexOf("Dani"));
		System.out.println(nomes.indexOf("Liza"));
		System.out.println(nomes.contains("Gustavo"));
		
		nomes.set(2, "David");
		System.out.println(nomes);
		
		System.out.println(nomes.isEmpty());
		nomes.clear();
		System.out.println(nomes);
		
		nomes.add("Gabrielle");
		nomes.add("Aline");
		nomes.add("Dani");
		nomes.add("Lucas");
		
		System.out.println(nomes);
		nomes.remove(1);
		System.out.println(nomes);
		
		for(String n : nomes) {
			System.out.println("Estamos vendo agora o nome: " + n);
		}
		
		System.out.println("Nomes retornados com iterator:");
		Iterator<String> iNomes = nomes.iterator();
		while(iNomes.hasNext()) {
			System.out.println(iNomes.next());
			// o next faz o mesmo que System.out.println(numero++);
			
		}

	}

}
