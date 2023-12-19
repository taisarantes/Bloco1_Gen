package aula07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2_Exceptions {

	public static void main(String[] args) {
		// exemplo anterior só que com tratamento de exception
		Scanner leia = new Scanner(System.in);
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop = true;
		
		do {
			try {
				System.out.println("Digite o dividendo: ");
				dividendo = leia.nextInt();
				
				System.out.println("Digite o divisor: ");
				divisor = leia.nextInt();
				
				divide(dividendo, divisor);
				
				loop = false;
			} catch(InputMismatchException e) {
				System.err.println("\nExceção: " + e);
				leia.nextLine();
				System.out.println("\nDigite valores inteiros.");
			} catch(ArithmeticException e) {
				System.err.println("\nExceção: " + e);
				leia.nextLine();
				System.out.println("\nDigite valores positivos.");
			} finally {
				System.out.println("\nSempre estarei aqui igual o Julius");
			}
			
		} while(loop);

	}
	
	public static void divide(int dividendo, int divisor) {
		System.out.printf("A divisão de %d por %d é de: %d", 
						dividendo, divisor, (dividendo / divisor));
	}

}
