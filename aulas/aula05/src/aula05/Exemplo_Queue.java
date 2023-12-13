package aula05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exemplo queue
		Queue<Integer> fila = new LinkedList<Integer>();
		
		for(int indice = 0; indice < 10; indice++) {
			fila.add(indice);
		}
		
		System.out.println("Elementos da fila: " + fila);
		System.out.println("Remover da fila: " + fila.remove());
		System.out.println("Fila atualizada: " + fila);
		System.out.println("Adicionar elementos na fila: " + fila.add(10));
		System.out.println("Fila atualizada: " + fila);
		System.out.println("Exibir o primeiro item da fila: " + fila.peek());
		System.out.println("Exibir o tamanho da fila: " + fila.size());
		System.out.println("Chechar se existe um elemento na fila: " 
								+ fila.contains(7));
		System.out.println("Exibir os itens com iterator: ");
		
		Iterator<Integer> iFila = fila.iterator();
		while(iFila.hasNext()) {
			System.out.println(iFila.next());
		}

	}

}
