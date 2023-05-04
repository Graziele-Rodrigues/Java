package principal;

public class Invoice {
	private int numeroItem;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public void setNumeroItem(int numeroItem) {
		this.numeroItem = numeroItem;
	}
	
	public int getNumeroItem() {
		return this.numeroItem; 
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao; 
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return this.quantidade; 
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco; 
	}
	
}
