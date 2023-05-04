package componentes;

public class Vendedor extends Empregado {
	private double valorVendas;
	private int qtdVendas;
	
	public Vendedor(String nome, double salario, double valorVendas, int qtdVendas) { //construtor
		super(nome, salario);
		this.valorVendas = valorVendas;
		this.qtdVendas = qtdVendas;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	public int getQtdVendas() {
		return qtdVendas;
	}
	
	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}
	
	public String toString() {
		return "Nome: "+ getNome()+", Salario: "+ getSalario() + ", Valor Vendas: " + getValorVendas() + ", Qtd.Vendas: " + getQtdVendas();
	}
}
