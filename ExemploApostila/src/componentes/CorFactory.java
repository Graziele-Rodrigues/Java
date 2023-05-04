package componentes;

public class CorFactory {
	public static Cor CriarCor(String cor) {
		if(cor == null) {
			return null;
		}
		if(cor.equalsIgnoreCase("preto")) {
			return new Preto();
		}
		else if(cor.equalsIgnoreCase("rosa")) {
			return new Rosa();
		}
		else if(cor.equalsIgnoreCase("branco")) {
			return new Branco();
		}
		return null;
	}
}
