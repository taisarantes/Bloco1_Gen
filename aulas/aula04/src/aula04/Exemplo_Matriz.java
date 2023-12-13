package aula04;

public class Exemplo_Matriz {

	public static void main(String[] args) {
		String matriz1[][] = {{"v1", "v2", "v3"}, 
				 {"v1", "v2", "v3"}, 
				 {"v1", "v2", "v3"}};

		String matriz2[][] = new String[3][3];
		// primeiro numero = linha, segundo numero = coluna
		// com matriz da pra fazer o 'String[][] matriz' tbm

		// exemplo

		int matriz[][] = {{10, 15, 35},
			  {70, 120, 140}, 
			  {50, 100, 150}};

		for(int iLinha = 0; iLinha < 3; iLinha++) {
			for(int iColuna = 0; iColuna < 3; iColuna++) {
				System.out.println("O valor armazenado na posição"
						+ " [ " + iLinha + " ] [ " + iColuna + " ] é: " +
						+ matriz[iLinha][iColuna]);
			}
		}

	}

}
