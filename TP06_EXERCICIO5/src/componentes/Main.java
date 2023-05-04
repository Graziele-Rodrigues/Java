package componentes;

public interface Main {
	public static void main(String[] args) {
	    FabricaDeCarro fabrica = new FabricaFiat();
	    CarroSedan sedan = fabrica.criarSedan();
	    CarroPopular popular = fabrica.criarPopular();
	    sedan.exibirInfoSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	    System.out.println();
	 
	    fabrica = new FabricaFord();
	    sedan = fabrica.criarSedan();
	    popular = fabrica.criarPopular();
	    sedan.exibirInfoFiestaSedan();
	    System.out.println();
	    popular.exibirInfoPopular();
	}
}
