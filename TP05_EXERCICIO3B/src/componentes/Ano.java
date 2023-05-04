package componentes;
import java.util.Comparator;

public class Ano implements Comparator<Funcionarios> {
	public int compare(Funcionarios a, Funcionarios b) {
			return Integer.valueOf(a.getAno()).compareTo(Integer.valueOf(b.getAno()));
		 }
	}