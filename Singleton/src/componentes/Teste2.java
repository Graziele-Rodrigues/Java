package componentes;

public class Teste2 {
	
	public static void main(String[] args) {
		AcessoBancoDados db = AcessoBancoDados.GetInstancia();
		db.openCon();
		db.update();
		db.closeCon();
	}
}
