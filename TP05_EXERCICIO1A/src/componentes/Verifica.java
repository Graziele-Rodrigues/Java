package componentes;

import java.util.Set;

public class Verifica {

	public static void verifica(String nome, Set<String> nomes) {
		if(nomes.contains(nome)) {
			System.out.println("============================");
			System.out.println(nome + " ja esta adicionado");
		}
		
	}

}
