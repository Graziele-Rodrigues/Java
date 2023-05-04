package componentes;

public class App {
	public static void main(String[] args) {
		Pessoas p = FactoryPessoa.Cria();
		System.out.println(p.toString());
	}

}
