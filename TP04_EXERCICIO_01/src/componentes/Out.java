package componentes;
import componentes.Form;

public class Out {
	public static void main(String[] args) {
		boolean imprime=true;
		Form p = new Form("Graziele Rodrigues", "149.161.486.22", "22/02/2003", "Brasil", "Minas Gerais", "Joao Monlevacde");
		if(imprime) {
			System.out.println(p.toString());		
		}
		else {
			System.out.print(p.flush());
		}
		
	}
}





