package componentes;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Produtos> produtos = new HashSet<>();
		Produtos Shampoo = new Produtos("1", "Shampoo Salonline", 10.5);
		Produtos Condicionador = new Produtos("2", "Condicionador SalonLine", 12.0);
		Produtos CremePentear = new Produtos("3", "Creme Pentear SalonLine", 15.0);
		Produtos Shampoo2 = new Produtos("1", "Shampoo Salonline", 10.5);

		
		produtos.add(Shampoo);
		produtos.add(Condicionador);
		produtos.add(CremePentear);
		produtos.add(Shampoo2); 
		
		
		System.out.println("\nProdutos: ");
		for(Produtos p : produtos) {
			System.out.println(p.toString());
		}
		
	}
}
