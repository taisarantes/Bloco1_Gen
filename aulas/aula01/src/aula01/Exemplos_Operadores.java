package aula01;

import java.util.Scanner;

public class Exemplos_Operadores {

	public static void main(String[] args) {
		//Syso + ctrl + espaço:
				// System.out.println();
				int resultado;
				System.out.println("Escolha uma operaão: ");
				System.out.println("1- soma           2- subtração");
				System.out.println("3 - multiplicação 4 - divisão");
				System.out.println("5 - mod");
				Scanner ler0 = new Scanner(System.in);
				int menu = ler0.nextInt();
				
				System.out.println("Digite um número inteiro: ");
				Scanner ler1 = new Scanner(System.in);
				int valor1 = ler1.nextInt();
				
				System.out.println("Digite outro número inteiro: ");
				Scanner ler2 = new Scanner(System.in);
				int valor2 = ler2.nextInt();
				
				System.out.printf("Valores: %d e %d", valor1, valor2);
				
				switch(menu) {
				case 1:
					resultado = valor1 + valor2;
					System.out.println("\nValor1 + valor2 = " + resultado);
					break;
				case 2:
					resultado = valor1 - valor2;
					System.out.println("Valor1 - valor2 = " + resultado);
					break;
				case 3:
					resultado = valor1 * valor2;
					System.out.println("Valor1 * valor2 = " + resultado);
					break;
				case 4:
					resultado = valor1 / valor2;
					System.out.println("Valor1 / valor2 = " + resultado);
					break;
				case 5:
					resultado = valor1 % valor2;
					System.out.println("Valor1 mod valor2 = " + resultado);
					break;
				}
				
				String nome = "Tais ";
				String nomeCompleto = nome + "Arantes";
				System.out.println(nomeCompleto);
				
				String produto = "Mouse ";
				produto += "gamer";
				System.out.println(produto);

	}

}
