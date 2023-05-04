package principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite os respectivos valores para a matriz");
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				matriz[i][j] = input.nextInt();
			}
		}
		
		int[][] matrizRot = new int[3][3];
		matrizRot = rotacionarMatriz(matriz);
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz.length;j++) {
				System.out.print(matrizRot[i][j]+" ");
			}
			System.out.println("");
		}
		
	}
	
	public static int[][] rotacionarMatriz(int[][] matriz) {
	    int largura = matriz.length;
	    int altura = matriz[0].length;
	    int[][] ret = new int[altura][largura];
	    for (int i=0; i<altura; i++) {
	        for (int j=0; j<largura; j++) {
	            ret[i][j] = matriz[largura - j - 1][i];
	        }
	     }
	    return ret;
	}

}
