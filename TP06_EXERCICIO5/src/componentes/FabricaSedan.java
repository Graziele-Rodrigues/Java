package componentes;

public class FabricaSedan implements FabricaDeCarro {
	
	@Override
	public CarroSedan criarSedan() {
		return new FiestaSedan();
	}
	
	@Override
	public CarroPopular criarPopular() {
		return new Fiesta();
	}

}
