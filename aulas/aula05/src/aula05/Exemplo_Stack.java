package aula05;

import java.util.Iterator;
import java.util.Stack;

public class Exemplo_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exemplo de pilha
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Prato verde");
		pilha.push("Prato azul");
		pilha.push("Prato branco");
		pilha.push("Prato amarelo");
		pilha.push("Prato vermelho");
		
		System.out.println("Elementos da pilha: " + pilha);
		System.out.println("Retirar elementos da pilha: " + pilha.pop());
		System.out.println("Elementos da pilha: " + pilha);
		System.out.println("Elementos da pilha: " + pilha.pop());
		System.out.println("Elementos da pilha: " + pilha.peek());
		System.out.println("Adicionar elementos da pilha: "
								+ pilha.push("Prato roxo"));
		System.out.println("Elementos da pilha: " + pilha);
		System.out.println("Tamanho da pilha: " + pilha.size());
		System.out.println("Verificar se existe elemento dentro da pilha: " 
								+ pilha.contains("Prato verde"));
		
		Iterator<String> iPilha = pilha.iterator();
		while(iPilha.hasNext()) {
			System.out.println(iPilha.next());
		}
		
		// utilizando pilhas: o efeito de desfazer de um software
		// basicamente o ctrl z é uma pilha, então quando ele vai apagar 
		// o último que foi adicionado na pilha.

	}

}
