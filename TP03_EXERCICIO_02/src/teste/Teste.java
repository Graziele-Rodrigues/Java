

package teste;

import componentes.Cliente;
import componentes.Vendedor;
import componentes.Gerente;

public interface Teste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Mariana", 30, "F", 15000, 1991);
		System.out.println(cliente);
		
		Vendedor vendendor = new Vendedor("Jose", 1250, 500, 50);
		System.out.println(vendendor);
		
		Gerente gerente = new Gerente("Jose", 1250, "151515", 30, "Vendas");
		System.out.println(gerente);
	}
}
