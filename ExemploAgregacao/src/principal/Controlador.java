package principal;

import componentes.Carro;
import componentes.Pessoa;

public class Controlador {
	public static void main(String[] args) {
		Carro carro = new Carro("punto", 2015, "preto");
		Pessoa pessoa = new Pessoa("José", "23456-3", carro);
		System.out.println(pessoa);
	}
}