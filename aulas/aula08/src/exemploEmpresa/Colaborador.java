package exemploEmpresa;

public class Colaborador {
	private Long id;
	private String nome;
	private Float salario;
	
	// nesse exemplo está sendo usada as classes dos tipos e não os tipos como primitiivo
	// pois a classe possui mais tratamento do que o tipo primitivo
	
	public Colaborador(Long id, String nome, Float salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

}
