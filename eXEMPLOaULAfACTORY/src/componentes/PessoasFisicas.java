package componentes;

public class PessoasFisicas extends Pessoas {
	private String cpf;
	
	public PessoasFisicas(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + "cpf=" + cpf;
	}
	
	
}
