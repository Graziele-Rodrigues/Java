package componentes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		Map<String, Funcionarios> funcionarios = new HashMap<>();
		funcionarios.put("a1234", new Funcionarios("Steve Jobs", "CEO", "12000"));
		funcionarios.put("a1235",  new Funcionarios("Scott McNealy", "CEO", "12000"));
		funcionarios.put("a1236", new Funcionarios("Jeff Bezos", "CEO", "12000"));
		funcionarios.put("a1237",  new Funcionarios("Larry Ellison", "CEO", "12000"));
		funcionarios.put("a1238",new Funcionarios("Bill Gates", "CEO", "12000"));
		
		for(Entry<String, Funcionarios> pair : funcionarios.entrySet()) {
			System.out.println("Chave: " + pair.getKey() + ", valor: " + pair.getValue().getNome() +" - "+ pair.getValue().getCargo() +" - "+ pair.getValue().getSalario());
			System.out.println("=============================");
			}
		}
	}