package principal;
import componentes.Pessoa;
public class Controlador {
	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa("Graziele");
		//posso colocar um for para criar mais de uma pessoa por vez
		Pessoa p1 = Pessoa.CriaPessoa();
		p1.EscreveNaTela();
	}
	
}




/* O m�todo static (atributo static) ele � um atributo da classe, ou seja, faz sentido para todos os objetos por ser compartilhado entre eles.
Dessa forma, todos os objetos daquele tipo ter� o mesmo nome. Quando n�o � static cada objeto tem o seu. � um variavel da classe e n�o da instancia
*/


//* Para acessa um atributo static de uma classe, o meotod que manipula aquele atributo tambem deve ser statiic.


// criar um contador para criar mais "pessoas""