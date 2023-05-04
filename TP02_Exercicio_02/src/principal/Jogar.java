package principal;

import java.util.Scanner;

public class Jogar {
	public static int[] jogar(Scanner scan, char simboloAtual) {
		int p[]=new int[2];
		System.out.println("Quem joga: "+simboloAtual);
		System.out.println("Informe a linha: ");
		p[0]=scan.nextInt();
		System.out.println("Informe a coluna: ");
		p[1]=scan.nextInt();
		return p;
	}
}
