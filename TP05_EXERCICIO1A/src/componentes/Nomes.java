package componentes;

import java.util.HashSet;
import java.util.Set;

public class Nomes {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
		String[] nomesPessoas = { "Graziele", "Laura", "Rosangela", "Graziele" };
		
		for(String nome : nomesPessoas ) {
			
			if(!nomes.add(nome)) {
				System.out.println(nome + " ja esta no conjunto, e nao sera inserido novamente");
			}
		}
		
		System.out.println("\nNomes");
		System.out.println(nomes);
		
		Verifica.verifica("Graziele", nomes);
		Remove.remove(nomes);
	}
}
