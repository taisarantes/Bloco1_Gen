package excecoes;

public class TesteExcecao {

	public static void main(String[] args) throws ExcecaoSimples {
		String nomes[] = {"Sukuna", "Yuji", "Gojo", "Megumi"};
		
		try {
			for(int i = 0; i < nomes.length; i++) {
				System.out.println(nomes[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Exceção: " + e);
			System.out.println("Posição inválida");
		}
		
		throw new ExcecaoSimples("Exceção simples");

	}

}
