package componentes;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Eu sei dividir!");
		System.out.print("Informe o primeiro valor: ");
		int x = teclado.nextInt();
		System.out.print("Informe o segundo valor: ");
		int y = teclado.nextInt();
		double r = 0;
		boolean funcionou = false;
		while(funcionou != true) {
		try {
			r = (x/y);
			funcionou = true;
			
		} catch (ArithmeticException e) {
			System.out.println("Exceção capturada. Tente novamente");
			System.out.print("Informe o primeiro valor: ");
			x = teclado.nextInt();
			System.out.print("Informe o segundo valor: ");
			y = teclado.nextInt();
			}
		}
		System.out.println("O resultado da divisao é " + r);
	}
}
