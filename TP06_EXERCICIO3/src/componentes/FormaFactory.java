package componentes;

public class FormaFactory {
	public static Forma DesenharForma(String forma) {
		if(forma == null) {
			return null;
		}
		if(forma.equalsIgnoreCase("quadrado")) {
			return new Quadrado();
		}
		else if(forma.equalsIgnoreCase("retangulo")) {
			return new Retangulo();
		}
		else if(forma.equalsIgnoreCase("triangulo")) {
			return new Triangulo();
		}
		else if(forma.equalsIgnoreCase("circulo")) {
			return new Circulo();
		}
		return null;
	}
}
