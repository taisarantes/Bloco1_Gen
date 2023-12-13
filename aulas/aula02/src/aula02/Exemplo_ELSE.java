package aula02;

import java.util.Scanner;

public class Exemplo_ELSE {

	public static void main(String[] args) {
		//exemplo 3, 4 e 5 nesse aq
		int idade = 18;
		boolean carteiraM = false;
		float nota1, nota2, media;
				
		if(idade >= 18 && carteiraM == true) {
			System.out.println("Você pode dirigir");
		} else {
			System.out.println("Você não está habilitado para dirigir");
		}
				
		Scanner leia = new Scanner(System.in);
				
		System.err.println("Digite a primeira nota");
		nota1 = leia.nextFloat();
				
		System.out.println("Digite a segunda nota");
		nota2 = leia.nextFloat();
				
		media = (nota1 + nota2)/2;
				
		if(media >= 6) {
			System.out.println("Parabens voce foi aprovade! Ganhe um abacaxi");
		} else if(media == 5) {
			System.out.println("Você está de exame");
		}
		else {
			System.out.println("Infelizmente você foi reprovade, pegue uma berinjela");
		} 

	}

}
