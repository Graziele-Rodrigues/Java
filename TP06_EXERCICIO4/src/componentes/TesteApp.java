package componentes;

public class TesteApp {
	public static void main(String[] args) {
		Lanchonete lanche = LanchoneteFactory.Cria();
		System.out.println(lanche.toString());
	}
}
