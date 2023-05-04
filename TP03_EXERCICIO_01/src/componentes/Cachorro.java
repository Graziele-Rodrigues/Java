package componentes;

public class Cachorro extends Animal {
	
	private String raca;

	public Cachorro(String nome, double peso, String raca) { //construtor
		super(nome, peso);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public String toString() {
		return "Nome "+ getNome()+ ", peso "+ getPeso() + "e raca" + getRaca();
	}
	
}
