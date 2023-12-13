package aula05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo2_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String nome;
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Sukuna");
		nomes.add("Ace");
		nomes.add("Tanjiro");
		System.out.println(nomes);
		
		System.out.println("Digite um nome: ");
		nome = leia.nextLine();
		nomes.add(nome);
		
		System.out.println(nomes);

	}

}
