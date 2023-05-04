package principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int num=0;  
		int tam=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		num = input.nextInt();
		input.close();
		
		tam = DescobreTamanho.Tamanho(num, tam);
		int fatores[] = new int[tam];
		MostraFatores.fatores(fatores, num, tam);
	}
}