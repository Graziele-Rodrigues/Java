package componentes;

public class Pessoa {
	private String nome;
	private String endereco;
	private String DataCriacao;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome; 
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String geEndereco() {
		return this.endereco; 
	}
	
	public void setDataCriacao(String DataCriacao) {
		this.DataCriacao = DataCriacao;
	}
	
	public String getDataCriacao() {
		return this.DataCriacao; 
	}
	
	public void EscreveNaTela() {
		System.out.println("blbala");
		System.out.println("getLogradouro().getRua()");
	}
	
	public static Pessoa CriaPessoa() {
		Pessoa p1 = new Pessoa("Blablal");
		return p1;
	}
}
