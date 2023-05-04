package dados;

public class Juridica extends Pessoa {
	private String cnpj;
	
	public Juridica(String nome, int idade, String cnpj) {
		super(nome, idade);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String toString() {
		String str = "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n" + "CNPJ:" + getCnpj()+ "\n";
		return str + "==============\n";
	}
}
