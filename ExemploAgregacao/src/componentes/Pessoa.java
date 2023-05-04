package componentes;

public class Pessoa {
	private String nome;
	private String cnh;
	private Carro carro;
	
	public Pessoa(String nome, String cnh, Carro carro) {
		this.nome = nome;
		this.cnh = cnh;
		this.carro = carro; /*Aqui um exemplo de agreçăo, pois a classe  pessoa năo vai contruir um carro  no seu construtor, o carro é um objeto recebido já instânciado*/
	}

	@Override
	public String toString() {
		return "Pessoa: nome=" + nome + ", cnh=" + cnh + ", tem " + carro + "]";
	}
	
}