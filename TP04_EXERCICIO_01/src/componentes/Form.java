package componentes;

public class Form {
	private String nome;
	private String cpf;
	//private int idade;
	private String dataNascimento;
	private String pais;
	private String estado;
	private String cidade;
	
	public Form(String nome, String cpf, String dataNascimento, String pais, String estado, String cidade) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.pais = pais;
		this.estado = estado;
		this.cidade = cidade;	
	}

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	/*public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}*/
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
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
	
	@Override
	public String toString() {
		return "Nome: "+ this.nome + "\n"+ "CPF: "+ this.cpf + "\n" + "Nascimento: "+ this.dataNascimento + "\n" + "Pais: " + this.pais + "\n" + "Estado: " + this.estado + "\n" + "Cidade: "+this.cidade;
	}
	
	public String flush() {
		String mensagem = "Salvando no arquivo...";
		return mensagem;
	}
}