package componentes;
import java.util.HashMap;
import java.util.Map;

public class CollectionTest {
	public static void main(String[] args) {
		HashMap<Integer, Pessoa> map = new HashMap<>();
		
		map.put(1, new Pessoa("111111", "Rafael"));
		map.put(2, new Pessoa("222222", "Fred"));
		
		
		for(Map.Entry<Integer,Pessoa> pair : map.entrySet()) {
			System.out.println("Chave: " + pair.getKey() + ", valor: " + pair.getValue().getNome() +" - "+ pair.getValue().getCpf());
		}
		
		/*String str = map.get(2);
		System.out.println(str);*/
	}
}
