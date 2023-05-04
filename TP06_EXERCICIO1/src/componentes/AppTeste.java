package componentes;

public class AppTeste {
	public static void main(String[] args) {
		SingletonVacina vc = SingletonVacina.GetInstancia();
		vc.primeiradose();
		vc.segundadose();
		vc.terceiradose();
	}
}
