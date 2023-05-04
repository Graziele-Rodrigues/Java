package componentes;

public class AppTeste3 {
	public static void main(String[] args) {
		SingletonVacina vc = SingletonVacina.GetInstancia();
		vc.segundadose();
	}
}
