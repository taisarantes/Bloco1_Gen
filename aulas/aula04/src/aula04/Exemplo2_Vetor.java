package aula04;

import java.util.Scanner;

public class Exemplo2_Vetor {

	public static void main(String[] args) {
		int vetorInteiros[] = new int[5];
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite o " + (i + 1) + "º numero : ");
			vetorInteiros[i] = leia.nextInt();
		}
		
		System.out.println("\nOs numeros digitados foram: \n");
		
		for(int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "º numero: " + vetorInteiros[i]);
		}

	}

}
