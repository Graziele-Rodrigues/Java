package componentes;

public class Main {
	public static void main(String[] args) {
		ImpressoraSingleton impressora = ImpressoraSingleton.GetInstancia();
		System.out.println("Objeto1:" + impressora);
		
		ImpressoraSingleton impressora2 = ImpressoraSingleton.GetInstancia();
		System.out.println("Objeto2: " + impressora2);
	}
}
