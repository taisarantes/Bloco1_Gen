package aula07;

import java.util.Scanner;

public class Exemplo4_Exception {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		boolean loop = true;
		
		do {
			try {
				System.out.println("Digite sua idade: ");
				idade = leia.nextInt();
				
				validarIdade(idade);
				
				loop = false;
			} catch(ArithmeticException e) {
				System.out.println("Digite um número inteiro maior ou igual a 18");
			}
		} while(loop);

	} 
	
	public static void validarIdade(int idade) {
		if(idade < 18) {
			throw new ArithmeticException("A pessoa não pode dirigir.");
		} else {
			System.out.println("A pessoa pode dirigir.");
		}
	}

}
