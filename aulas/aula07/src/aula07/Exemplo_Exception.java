package aula07;

import java.util.Scanner;

public class Exemplo_Exception {

	public static void main(String[] args) {
		// exemplo de programa que pode dar um erro caso 
		// o usuario tente dividir um número por 0
		Scanner leia = new Scanner(System.in);
		
		int dividendo = 0;
		int divisor = 0;
		
		System.out.println("Digite o dividendo: ");
		dividendo = leia.nextInt();
		
		System.out.println("Digite o divisor: ");
		divisor = leia.nextInt();
		
		divide(dividendo, divisor);

	}
	
	public static void divide(int dividendo, int divisor) {
		System.out.printf("A divisão de %d por %d é de: %d", 
						dividendo, divisor, (dividendo / divisor));
	}

}
