package componentes;

public class Carro {
	private Cor cor;
	public Carro(String cor) {
		this.cor = CorFactory.CriarCor(cor);
	}
	
	public Cor getCor() {
		return this.cor;
	}
}
