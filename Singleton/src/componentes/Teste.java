package componentes;

public class Teste {
	
	public static void main(String[] args) {
		AcessoBancoDados db = AcessoBancoDados.GetInstancia();
		db.openCon();
		db.create();
		db.update();
		db.read();
		db.delete();
		db.closeCon();
	}
}
