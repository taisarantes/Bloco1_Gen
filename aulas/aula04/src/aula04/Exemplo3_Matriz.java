package aula04;

public class Exemplo3_Matriz {

	public static void main(String[] args) {
		// exemplo for each
		
		String alunes[] = {"Ranna", "Yann", "Gabriel", "Amanda"};
				
		System.out.println("For normal: ");
		for(int i = 0; i < alunes.length; i++) {
			System.out.println(alunes[i]);
		}
				
		System.out.println("\nFor each: ");
		for(String alune: alunes) {
			System.out.println(alune);
		}

	}

}
