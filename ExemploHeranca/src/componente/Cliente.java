package componente;

public class Cliente extends Pessoa {
	
	private float credito;
	
	public Cliente(String nome, int idade, String cpf, float credito) { //construtor
		super(nome, idade, cpf); //pegar valor da classe Pessoa
		this.credito = credito;
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}
}