package componentes;

public class Endereço extends Form {
private String estado;
private String cidade;
private String rua;
	
	public Endereço(String nome, int idade, String cpf, String estado, String cidade, String rua) {
		super(nome, idade, cpf);
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String toString() {
		String str = "Nome: " + getNome() + "\n" + "Idade: " + getIdade() + "\n" + "CPF: " + getCpf()+ "\n"+ "Estado: " + getEstado()+ "\n"+ "Cidade: " + getCidade()+ "\n"+ "Rua: " + getRua()+ "\n";
		return str + "==============\n";
	}
}
