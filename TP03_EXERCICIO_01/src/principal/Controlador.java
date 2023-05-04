package principal;

import componentes.Peixe;

public class Controlador {
	public static void main(String[] args) {
		Peixe peixe = new Peixe("Baiacu", 5.5, "agua doce");
		System.out.println(peixe);
		Peixe cachorro = new Peixe("Bob", 12.5, "golden retriever");
		System.out.println(cachorro);
	}
}
