package principal;
import componentes.Grade;
import java.util.Scanner; 

public class JogoDaVelha {
	public static void main(String[] args) {
		Grade[][] velha = new Grade[3][3];
		Boolean game=true;
		char simboloAtual='X';
		char vitoria=' ';
		Scanner scan=new Scanner(System.in);
		//scan.close();
		Inicia.iniciarJogo(velha);
		
		
		while(game) {
			desenhaJogo.desenhaJogoVelha(velha);
			vitoria = Vitoria.verificaVitoria(velha);
			if(vitoria!=' ') {
				System.out.println("Jogador "+vitoria+" venceu");
				break;
			}
			else {
				if(Jogada.verificarJogada(velha, Jogar.jogar(scan, simboloAtual), simboloAtual)) {
					if(simboloAtual=='X') {
						simboloAtual='O';
					}
					else {
						simboloAtual='X';
					}
				}
			
			}		
		}
		System.out.println("Fim do Jogo");
	}
	
}
