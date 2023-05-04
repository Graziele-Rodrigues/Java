package componentes;

public class FactoryPessoa {
	public static Pessoas Cria() {
		String tipoPessoa = "111.111.111-11";
		if(tipoPessoa.length() == 14) {
			return new PessoasFisicas("Graziele", "Joao Monlevade", "149.161.486-22");
		}
		else {
			return new PessoasJuridicas("Graziele", "Joao Monlevade", "222.222.222.222");
		}
	}
}
