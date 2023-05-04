package principal;

import componentes.Grade;

public class Jogada {
	public static Boolean verificarJogada(Grade[][] velha, int p[], char simboloAtual) {
		if(velha[p[0]][p[1]].getSimbolo()==' ') {
			velha[p[0]][p[1]].setSimbolo(simboloAtual);
			return true;
		}else {
			return false;
		}
	}
}
