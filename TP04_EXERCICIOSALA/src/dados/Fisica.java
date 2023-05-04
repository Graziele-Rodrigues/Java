package dados;

public class Fisica extends Pessoa {
	private String cpf;
	
	public Fisica(String nome, int idade, String cpf) {
		super(nome, idade);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		String str = "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n" + "CPF: " + getCpf()+ "\n";
		return str + "==============\n";
	}
}
