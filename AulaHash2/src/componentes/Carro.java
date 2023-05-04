package componentes;

public class Carro {
	private int ano;
	private String modelo;
	private String placa;
	private double preco;
	
	public Carro(int ano, String modelo, String placa, double preco) {
		this.ano = ano;
		this.modelo = modelo;
		this.placa = placa;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Modelo: " + this.modelo + "\n" + "Ano: " + this.ano + "\n" + "Placa: " + this.placa + "\n" + "Preco: " + this.preco;
	}
	
}
