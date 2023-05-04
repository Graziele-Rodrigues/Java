package componentes;

public class Produtos {
	private String id;
	private String nome;
	private double preco;
	
	public Produtos(String id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "====================\n" + this.id + "\n" + this.nome + "\n" + this.preco; 
	}

}
