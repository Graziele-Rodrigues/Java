package componentes;

public class Incremental {
	public static Incremental instancia = null;
	
	private Incremental() {
		numero = ++count;
	}
	
	public static Incremental GetInstancia() {
		if(instancia == null) {
			instancia = new Incremental();
		}
		return instancia;
	}
	
	private static int count =0;
	private int numero;
	
	public String toString() {
		return "Incremental" + numero;
	}
}
