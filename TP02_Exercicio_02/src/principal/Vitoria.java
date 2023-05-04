package principal;

import componentes.Grade;

public class Vitoria {
	public static char verificaVitoria(Grade[][] velha) {
		char ganhador = ' ';
		if((velha[0][0].getSimbolo()=='X' && velha[0][1].getSimbolo()=='X' && velha[0][2].getSimbolo()=='X')||(velha[1][0].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[1][2].getSimbolo()=='X')||(velha[2][0].getSimbolo()=='X' && velha[2][1].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X')) {
			ganhador = 'X';
		}
		else if((velha[0][0].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X')||(velha[0][2].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][0].getSimbolo()=='X')) {
			ganhador = 'X';
		}
		else if((velha[0][0].getSimbolo()=='X' && velha[1][0].getSimbolo()=='X' && velha[2][0].getSimbolo()=='X')||(velha[0][1].getSimbolo()=='X' && velha[1][1].getSimbolo()=='X' && velha[2][1].getSimbolo()=='X')||(velha[0][2].getSimbolo()=='X' && velha[1][2].getSimbolo()=='X' && velha[2][2].getSimbolo()=='X')) {
			ganhador = 'X';
		}
		else if((velha[0][0].getSimbolo()=='O' && velha[0][1].getSimbolo()=='O' && velha[0][2].getSimbolo()=='O')||(velha[1][0].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[1][2].getSimbolo()=='O')||(velha[2][0].getSimbolo()=='O' && velha[2][1].getSimbolo()=='O' && velha[2][2].getSimbolo()=='O')) {
			ganhador = 'O';
		}
		else if((velha[0][0].getSimbolo()=='0' && velha[1][1].getSimbolo()=='O' && velha[2][2].getSimbolo()=='O')||(velha[0][2].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[2][0].getSimbolo()=='O')) {
			ganhador = 'O';
		}
		else if((velha[0][0].getSimbolo()=='O' && velha[1][0].getSimbolo()=='O' && velha[2][0].getSimbolo()=='O')||(velha[0][1].getSimbolo()=='O' && velha[1][1].getSimbolo()=='O' && velha[2][1].getSimbolo()=='O')||(velha[0][2].getSimbolo()=='O' && velha[1][2].getSimbolo()=='O' && velha[2][2].getSimbolo()=='O')) {
			ganhador = 'O';
		}
		else {
			ganhador = ' '; 
		}
		return ganhador;
	}
}
