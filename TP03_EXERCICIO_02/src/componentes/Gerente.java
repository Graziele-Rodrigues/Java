package componentes;

public class Gerente extends Empregado {
	private String nomeGerencia;
	
	public Gerente(String nome, double salario, String matricula, int idade, String nomeGerencia) {
		super(nome, salario);
		super.setMatricula(matricula);
		super.setIdade(idade);
		this.nomeGerencia = nomeGerencia;
	}
	
	public String getNomeGerencia() {
		return nomeGerencia;
	}
	
	public void setNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	public String toString() {
		return "Nome: "+ getNome()+", Idade: "+ getIdade() + ", Matricula: " + getMatricula() + ", NomeGerencia: " + getNomeGerencia() + ", INSS: "+ getValorInss();
	}
}
