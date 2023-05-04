package componentes;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criarSedan() {
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarPopular() {
		return new Fiesta();
	}

}
