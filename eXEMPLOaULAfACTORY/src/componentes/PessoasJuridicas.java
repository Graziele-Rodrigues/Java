package componentes;

public class PessoasJuridicas extends Pessoas {
	private String cnpj;
	
	public PessoasJuridicas(String nome, String endereco, String cnpj) {
		super(nome, endereco);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return super.toString() +  " cnpj=" + cnpj;
	}
	
	
}
