package aula06;

public class Exemplo_Metodos {

	public static void ola() {
		System.out.println("Ola mundo");
		
		// void não retorna nada
	}
	
	public static int soma() {
		int x = 3;
		if(x>2) {
			return x;
		} else {
			return x;
			
			// se for utilizar laço de condição, sempre
			// tem que ter um else retornando um valor do 
			// tipo do método
		}
		
		
		// int TEM que retornar um inteiro
	}
	
	public static void main(String[] args) {
		ola();
		soma();
		System.out.println(soma());
	}

}
