package principal;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<ClasseAbstrata> cartoes = new ArrayList<>();
		DiaDosNamorados luana = new DiaDosNamorados("Luana");
		Natal natiele = new Natal("Natiele");
		Aniversario julia = new Aniversario("Julia");
		
		cartoes.add(luana);
		cartoes.add(natiele);
		cartoes.add(julia);
		
		for(ClasseAbstrata c : cartoes) {
			c.ShowMessage();
		}
	}
}
