package componentes;

public class Empregado extends Pessoa {
	private double salario;
	private String matricula;
	private double inss;
	
	public Empregado(String nome, double salario) { //construtor
		super(nome);
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getValorInss() {
		inss = salario*11/100;
		return inss;
	}
	
	
	
	
}
