package componentes;
import java.util.Comparator;

public class Salario implements Comparator<Funcionarios> {
	public int compare(Funcionarios a, Funcionarios b) {
			return Double.valueOf(a.getSalario()).compareTo(Double.valueOf(b.getSalario()));
		 }
	}
