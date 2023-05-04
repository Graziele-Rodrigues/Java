package componentes;

public class Main {
	public static void main(String[] args) {
		Carro gol = new Carro("PRETO");
		Cor cor = gol.getCor();
		cor.exibir();
	}
}
