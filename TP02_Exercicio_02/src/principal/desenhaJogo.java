package principal;

import componentes.Grade;

public class desenhaJogo {
	public static void desenhaJogoVelha(Grade[][] velha){ //parametro passagem
		Limpa.limparTela();	
		System.out.println("     0     1     2");
		System.out.printf(" 0    %c  | %c  | %c  %n", velha[0][0].getSimbolo(), velha[0][1].getSimbolo(), velha[0][2].getSimbolo());
		System.out.println("   --------------------");
		System.out.printf(" 1    %c  | %c  | %c  %n", velha[1][0].getSimbolo(), velha[1][1].getSimbolo(), velha[1][2].getSimbolo());
		System.out.println("   --------------------");
		System.out.printf(" 2    %c  | %c  | %c  %n", velha[2][0].getSimbolo(), velha[2][1].getSimbolo(), velha[2][2].getSimbolo());
	}
}
