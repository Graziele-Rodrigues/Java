package componentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		List<Funcionarios> lista = new ArrayList<Funcionarios>();
		lista.add(new Funcionarios(1, "Ana", 5000.0, 2019));
		lista.add(new Funcionarios(2, "Bruna", 7000.0, 2008));
		lista.add(new Funcionarios(3, "Carol", 2000.0, 2021));

		//ordem crescente pelo salario
		Salario salario = new Salario();
		Collections.sort(lista, salario);
		System.out.println("\n" + "Lista ordenada por valor salario: ");
		System.out.println("=================================================");
		for (Funcionarios item : lista) {
			System.out.println(item.toString());
		}
		
		//funcionario com maior salario
		System.out.println("\n" + "Funcionario maior salario: ");
		System.out.println("=================================================");
		System.out.println(lista.get(lista.size() - 1));
				
		//funcionario menor salario
		System.out.println("\n" + "Funcionario menor salario: ");
		System.out.println("=================================================");
		System.out.println(lista.get(0));
		
		//ordem alfabetica
		Alfabetico alfabetico = new Alfabetico();
		Collections.sort(lista, alfabetico);
		System.out.println("\n" + "Lista ordenada em ordem alfabetica: ");
		System.out.println("=================================================");
		for (Funcionarios item : lista) {
			System.out.println(item.toString());
		}
		
		
		//funcionario mais antigo
		Ano ano = new Ano();
		Collections.sort(lista, ano);
		System.out.println("\n" + "Funcionario mais nova: ");
		System.out.println("=================================================");
		System.out.println(lista.get(lista.size() - 1));
		
		//funcionario mais novo
		System.out.println("\n" + "Funcionario mais velha: ");
		System.out.println("=================================================");
		System.out.println(lista.get(0));
	}
 }
