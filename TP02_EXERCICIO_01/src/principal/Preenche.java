package principal;

import java.util.Scanner;

import componentes.Grafo;

public class Preenche {
	public static void preencheGrafo(Grafo[][] grafo, int TAM, Scanner scan) {
		for(int i=0;i<TAM;i++) {
			for(int j=0;j<TAM;j++) {
				grafo[i][j]=new Grafo();
				System.out.println("Valor (0 ou 1) para posição ["+(i+1)+"]["+(j+1)+"]: ");
				grafo[i][j].setValor(scan.nextInt());
			}
		}
	}
}
