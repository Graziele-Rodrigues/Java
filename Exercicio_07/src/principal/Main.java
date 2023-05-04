package principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Invoice  p1 = new Invoice();

		
		Scanner input = new Scanner(System.in);
		System.out.print("Numero do item: ");
		p1.setNumeroItem(input.nextInt());
		System.out.print("Descrição: ");
		p1.setDescricao(input.next());
		System.out.print("Quantidade: ");
		p1.setQuantidade(input.nextInt());
		if(p1.getQuantidade()<0) {
			p1.setQuantidade(0);
		}
		System.out.print("Preço item: ");
		p1.setPreco(input.nextDouble());
		if(p1.getPreco()<0) {
			p1.setPreco(0);
		}
		input.close();
		
		
		GetInvoiceAmount.Amount(p1.getNumeroItem(), p1.getQuantidade(), p1.getPreco());
		
	}
}
