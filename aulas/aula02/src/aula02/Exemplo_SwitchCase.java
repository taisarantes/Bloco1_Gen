package aula02;

import java.util.Scanner;

public class Exemplo_SwitchCase {
	public static void main(String[] args) {
		int opcao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### ##### Menu ##### #### ### ## #");
		System.out.println("\n-- Digite 1 para indicação de livro         --");
		System.out.println("\n-- Digite 2 para ler uma frase motivacional --");
		System.out.println("\n-- Digite 3 para indicação de musica        --");
		
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Livro: Jogos Vorazes");
			break;
		case 2: 
			System.out.println("Frase motivacional: Tudo vai ficar bem! Já vencemos.");
			break;
		case 3:
			System.out.println("Música: Portrait of a Blank Slate - Lovejoy");
			break;
		default:
			System.out.println("Opção invalida");
		}
		
	}

}
