package aula01;

import java.util.Scanner;

public class Exemplos_Variaveis {

	public static void main(String[] args) {
		/* comentário de várias linhas
		 * no java */
		//variáveis no java
		byte n1 = 5;
		int idade = 19;
		System.out.println(n1);
		n1 = 6;
		float altura = 1.59f;
		/* o float ele tem uma precisão menor para 
		 * cálculos, então se um valor não vai ser
		 * calculado, pode-se usar o float, mas
		 * sempre q for preciso fazer cálculos,
		 * usar o double */ 
		Long codigo = 309233l;
		boolean aceitaProposta = true;
		char letra = 't';
		String nome = "Tais";
		/* a string é uma classe pq antes pra escrever
		 * frase, era preciso utilizar vários char, ent
		 * criaram uma classe para tratar vários char 
		 * que formarão as palavras/frase */
		System.out.println(nome + " tem " + idade);
		System.out.printf("A altura é %f", altura);
		System.out.printf("\nA altura é %.2f", altura);
		
		System.out.println("Digite seu nome: ");
		Scanner leia = new Scanner(System.in);
		nome = leia.nextLine();
		System.out.println("Seja bem-vinde " + nome + "!");

	}

}
