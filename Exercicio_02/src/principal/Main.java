package principal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Estoque[] vetor = new Estoque[50];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite respectivamente nome da planta, estoque ideal e estoque disponivel");
		
		for(int i=0;i<50;i++) {
			vetor[i] = new Estoque();
			vetor[i].setNomePlanta(input.next());
			vetor[i].setEstoqueIdeal(input.nextInt());
			vetor[i].setEstoqueDisponivel(input.nextInt());
		}
		
		for(int i=0;i<3;i++) {
			if(vetor[i].getEstoqueDisponivel()>vetor[i].getEstoqueIdeal()) {
				System.out.println("Estoque suficiente de " + vetor[i].getNomePlanta() );
			}
			else {
			System.out.println("Ele deve comprar mais "+ (vetor[i].getEstoqueIdeal()-vetor[i].getEstoqueDisponivel()) + " " + vetor[i].getNomePlanta());
			}
		}
	}
}
