package componentes;

import java.util.Set;

public class Remove {
	public static void remove(Set<String> nomes) {
		nomes.clear();
		System.out.println("===========================");
		System.out.println(nomes);
	}
}
