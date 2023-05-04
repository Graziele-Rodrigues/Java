package componentes;

public class Main {
	public static void main(String[] args) {
		FormaGeometrica retangulo = new FormaGeometrica("retangulo");
		Forma forma = retangulo.getForma();
		forma.desenhar();
	}
}
