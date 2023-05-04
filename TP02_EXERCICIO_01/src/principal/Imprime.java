package principal;

import componentes.Grafo;

public class Imprime {
	public static void imprimeGrafo(Grafo[][] grafo, int TAM) {
		System.out.println("----- Matriz de adjacência do grafo ------");
		for(int i=0;i<TAM;i++) {
			for(int j=0;j<TAM;j++) {
				System.out.print(grafo[i][j].getValor()+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
