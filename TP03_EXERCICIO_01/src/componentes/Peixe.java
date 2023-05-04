package componentes;

public class Peixe extends Animal {
	
	private String habitat;
	
	
	public Peixe(String nome, double peso, String habitat) { //construtor
		super(nome, peso);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String toString() {
		return "Nome "+ getNome()+ ", peso "+ getPeso() + " e habitat " + getHabitat();
	}
	
}


