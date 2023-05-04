package componentes;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		String[] vetNomes = {"eduardo", "alice", "gustavo"};
		ArrayList<String> nomes = new ArrayList<>();
		
		for(String nome : vetNomes) {
			nomes.add(nome);
		}
		 exibirNomes(nomes);
	}

public static void exibirNomes(ArrayList<String> nomes) {
	System.out.println("Nomes: ");
	for(String nome : nomes) {
		System.out.println(nome);
		}
	}
}