package componentes;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}

}
