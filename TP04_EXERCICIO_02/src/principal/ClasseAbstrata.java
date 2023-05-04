package principal;

public abstract class ClasseAbstrata {
	private String destinatario;
	
	public ClasseAbstrata(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public void MostraDestinatario() {
		System.out.print("Olá, " + this.destinatario + ", ");
	}

	public abstract void ShowMessage();


}
