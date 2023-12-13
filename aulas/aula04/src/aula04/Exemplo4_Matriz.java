package aula04;

public class Exemplo4_Matriz {

	public static void main(String[] args) {
		String alunes[][] = {{"Larissa", "Dani", "Igor"}, 
				 {"Thaiana", "Tais", "Thayna"}, 
				 {"Nathan", "Nat", "Nathalia"}};

		for(String[] linha: alunes) {
			for(String alune: linha) {
				System.out.println(alune);
			}
		}

	}

}
