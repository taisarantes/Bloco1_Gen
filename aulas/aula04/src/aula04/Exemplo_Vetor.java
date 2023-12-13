package aula04;

public class Exemplo_Vetor {

	public static void main(String[] args) {
		// aula de vetores e matrizes
				String vetorString[] = {"Sukuna", "Yuji", "Megumi", "Nobara", "Gojo"};
				
				int vetoeInteiros[] = {1, 2, 3, 4};
				
				String[] vetorString2 = {"Sukuna", "Gojo", "Toji", "Yuta"};
				
				String abacaxi[] = new String[5];
				// esse é o jeito de declarar um vetor sem valores,
				// precisa ter o tamanho do vetor sempre
				
				System.out.println(vetorString.length);
				
				// exemplo
				
				int vetorInteiros[] = {10, 15, 35, 70, 140};
				
				System.out.println(vetorInteiros[0]);
				System.out.println(vetorString[0]);
				
				System.out.println("1º elemento: " + vetorString[0]);
				
				for(int indice = 0; indice < 5; indice++) {
					System.out.println((indice + 1) + "º elemento: " + vetorString[indice]);
				}

	}

}
