package componentes;

public class SingletonVacina {
	
	public static SingletonVacina instancia = null;
	private boolean vacinado = false;

	
	private SingletonVacina() {
		System.out.println("Construtor");
	}
		
	public static SingletonVacina GetInstancia() {
		if(instancia ==null) {
			instancia = new SingletonVacina();
		}
		return instancia;
	}
	
	public void primeiradose() {
		System.out.println("Primeira dose vacina");
		vacinado = true;
	}
	
	public void segundadose() {
		if(vacinado == true) {
			System.out.println("Segunda dose vacina");
		}else {
		System.out.println("É necessario ter a primeira dose tomada.");
		}
	}
	
	public void terceiradose() {
		if(vacinado == true) {
			System.out.println("Terceira dose vacina");
		}else {
		System.out.println("É necessario ter a primeira e segunda doses tomadas.");
		}


	}
	
}
