package componentes;


import java.util.Collections;
import java.util.List;

public class OrdemAlfabetica {
	public static void OrdemAlfabetica(List<Funcionarios> lista) {
		Alfabetico alfabetico = new Alfabetico();
		Collections.sort(lista, alfabetico);
		System.out.println("Lista ordenada em ordem alfabetica: ");
		for (Funcionarios item : lista) {
			System.out.println("=================================================");
			System.out.println(item.toString());
		}
	}
}
