package principal;

import java.util.Scanner;

import componentes.Grafo;

public class Vizinhos {
	public static void vertices(Grafo[][] grafo, Scanner scan) {
		System.out.println("Digite dois vertices para saber se sao vizinhos: ");
		int v1 = scan.nextInt();
		int v2 = scan.nextInt();
		if(grafo[v1-1][v2-1].getValor()==1) {
			System.out.println("Vertices "+v1+" e "+v2+" sao vizinhos! ");
		}else {
			System.out.println("Vertices "+v1+" e "+v2+" nao sao vizinhos! \""); 
		}
	}
}
