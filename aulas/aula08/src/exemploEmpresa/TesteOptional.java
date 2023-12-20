package exemploEmpresa;

import java.util.Optional;

public class TesteOptional {

	public static void main(String[] args) {
		// testtando a classe colaboradores
		
		Colaborador c = new Colaborador(1L, "Sukuna", 300000F);
		
		Optional<Colaborador> colab = Optional.of(c);
		
		colab.map(respota -> respota.getNome())
				.filter(colaboradorNome -> colaboradorNome.startsWith("S"))
				.orElseThrow(() -> new RuntimeException("Colaborador não encontrado!"));
		// o optional está sendo mapeado com base em:
		// em respota, é armazenado o nome que demos ao colaborador
		// e usamos o filter para filtrar nomes que começam com J
		// e que serão armazenados em colaboradorNome
		// se não tiver nenhum colaborador com J, ele irá lançar a exception
		
		System.out.println("Colaborador encontrado: " + colab.get().getNome());

	}

}
