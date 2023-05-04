package principal;

import componentes.Grafo;

public class verticesVizinhos {
	public static void todosVerticesVizinhos(Grafo[][] grafo, int TAM) {
		System.out.println("------- Vertices vizinhos ------");
		for(int i=0;i<TAM;i++) {
			System.out.print(i+1+": ");
			for(int j=0;j<TAM;j++) {
				if(grafo[i][j].getValor()==1) {
					System.out.print(j+1+",");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
}
