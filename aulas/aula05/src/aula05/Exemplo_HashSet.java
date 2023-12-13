package aula05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exemplo_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exemplo de uso de set
		
		Set<String> setNomes = new HashSet<String>();
		Set<Long> setCodigo = new HashSet<Long>();
		
		setNomes.add("Cintia");
		setNomes.add("Amanda");
		setNomes.add("amanda");
		setNomes.add("Nath");
		setNomes.add("Andre");
		setNomes.add("Andre");
		setNomes.add("Andre");
		
		System.out.println(setNomes);
		System.out.println("setNomes está vazio?: " + setNomes.isEmpty());
		System.out.println("Existe o dado Nath na coleção setNomes?: " + setNomes.contains("Nath"));
		System.out.println("setCodigo esta vazio?: " + setCodigo.isEmpty());
		
		setNomes.remove("amanda");
		System.out.println(setNomes);
		
		for(String nome : setNomes) {
			System.out.println("Temos o nome: " + nome);
		}
		
		System.out.println("Nomes retornados com iterator: ");
		Iterator<String> iSetNomes = setNomes.iterator();
		while(iSetNomes.hasNext()) {
			System.out.println(iSetNomes.next());
		}

	}

}

