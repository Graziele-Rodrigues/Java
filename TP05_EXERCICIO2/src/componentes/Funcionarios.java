package componentes;

public class Funcionarios {
	private String nome;
	private String cargo;
	private String salario;
	
	public Funcionarios(String nome, String cargo, String salario) {
		this.setNome(nome);
		this.setCargo(cargo);
		this.setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
}
