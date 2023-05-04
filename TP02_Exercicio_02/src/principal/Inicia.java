package principal;

import componentes.Grade;

public class Inicia {
	public static void iniciarJogo(Grade[][] velha) {
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				velha[l][c]=new Grade();			}
		}
	}
}
