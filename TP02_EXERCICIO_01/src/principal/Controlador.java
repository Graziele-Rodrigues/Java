package principal;

import java.util.Scanner;

import componentes.Grafo;

public class Controlador {
	public static void main(String[] args) {
		int TAM;
		Scanner scan=new Scanner(System.in);
		System.out.println("Quantos vertices tem o grafo? "); 
		TAM = scan.nextInt();
		Grafo[][] grafo = new Grafo[TAM][TAM];
		Preenche.preencheGrafo(grafo, TAM, scan);
		Imprime.imprimeGrafo(grafo, TAM);
		verticesVizinhos.todosVerticesVizinhos(grafo, TAM);
		Vizinhos.vertices(grafo, scan);
	}
}
