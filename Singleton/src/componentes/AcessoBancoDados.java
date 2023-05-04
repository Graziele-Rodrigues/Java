package componentes;

public class AcessoBancoDados {
	
	public static AcessoBancoDados instancia = null;
	private boolean openCon = false;

	
	private AcessoBancoDados() {
		System.out.println("Construtor");
	}
		
	public static AcessoBancoDados GetInstancia() {
		if(instancia ==null) {
			instancia = new AcessoBancoDados();
		}
		return instancia;
	}
	public void openCon() {
		System.out.println("Abrindo conexao");
		openCon = true;
	}
	
	public void create() {
		System.out.println("Criando dados");

	}
	
	public void read() {
		System.out.println("Lendo dados");

	}
	
	public void update() {
		System.out.println("Atualizando dados");

	}
	
	public void delete() {
		System.out.println("Deletando dados");

	}
	
	public void closeCon() {
		System.out.println("fechando conexao");

	}

}
