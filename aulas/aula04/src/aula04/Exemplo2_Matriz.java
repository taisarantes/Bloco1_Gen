package aula04;

import java.util.Scanner;

public class Exemplo2_Matriz {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		Scanner leia = new Scanner(System.in);
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite o valor para a posição "
						+ "[" + linha + "][" + coluna + "]");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println("O valor armazenado na posição "
						+ "[" + linha + "] [" + coluna + "] é: " + matriz[linha][coluna]); 
			}
		}

	}

}
