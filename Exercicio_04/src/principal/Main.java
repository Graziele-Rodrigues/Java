package principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int soma=0, ano=0;
		int[][] vendas = new int[12][4];
		Scanner input = new Scanner(System.in);
		System.out.println("Digite os respectivos valores ganhos em cada semana do mes");
		
		for(int i=0;i<12;i++) {
			for(int j=0;j<4;j++) {
				vendas[i][j] = input.nextInt();
			}
		}
		
		//total vendido no mes
		for(int i=0;i<12;i++) {
			for(int j=0;j<4;j++) {
				soma = soma+vendas[i][j];
			}
			System.out.println("Total de venda no mes "+(i+1)+" R$"+soma);
			soma=0;
		}
		
		//total vendido em cada semana do mes
		for(int i=0;i<12;i++) {
			for(int j=0;j<4;j++) {
				System.out.println("Total ganho no mes "+(i+1)+", semana "+(j+1)+" - R$"+vendas[i][j]);
			}
		}
		
		
		//total vendido no ano
		for(int i=0;i<12;i++) {
			for(int j=0;j<4;j++) {
				ano = ano+vendas[i][j];
			}
		}
		System.out.println("Total ganho no ano R$"+ano);
	}
}
