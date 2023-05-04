package componentes;

public class FabricaFiat implements FabricaDeCarro {
	
	@Override
	public CarroSedan criarSedan() {
		return new Siena();
	}
	
	@Override
	public CarroPopular criarPopular() {
		return new Palio();
	}
}
