package aula07;

import java.util.Scanner;

public class Exemplo3_Exception {

	public static void main(String[] args) {
		// exemplo throw
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		validarIdade(idade);

	}
	
	public static void validarIdade(int idade) {
		if(idade < 18) {
			throw new ArithmeticException("A pessoa não pode dirigir.");
		} else {
			System.out.println("A pessoa pode dirigir.");
		}
	}

}
