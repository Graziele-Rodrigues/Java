package componentes;

public class Funcionarios{
	private int id;
	private String nome;
	private double salario;
	private int ano;
	
	public Funcionarios(int id, String nome, double salario, int ano) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.ano = ano;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString(){
		return this.id + " - " + this.nome + " - " + this.salario + " - " + this.ano;
	}
	
}
