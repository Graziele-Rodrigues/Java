package componentes;
import java.util.Comparator;

public class Alfabetico implements Comparator<Funcionarios> {
	public int compare(Funcionarios a, Funcionarios b) {
		   return a.getNome().compareTo(b.getNome());
		 }
	}
