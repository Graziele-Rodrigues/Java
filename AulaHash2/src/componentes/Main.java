package componentes;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) {
	Map<String, Carro> mapa = new HashMap<>();
	
	Carro focus = new Carro(2015, "Ford Focus", "Jax-1010", 30000);
	Carro fiatUno = new Carro(2000, "Fiat Uno", "ABC-9999", 8000);
	Carro palio = new Carro(2008, "Palio", "Fac-5412", 10000);
	Carro fusca = new Carro(1990, "Fusca", "HLG-5241", 4000);
	
	mapa.put("JAX-1010", focus);
	mapa.put("ABC-9999", fiatUno);
	mapa.put("FAC-5412", palio);
	mapa.put("HLG-5241", fusca);
	
	for(Entry<String, Carro> pair : mapa.entrySet()) {
		Carro c = mapa.get(pair.getKey());
		System.out.println(c.toString());
		System.out.println("=============================");
		}
	}	
}
