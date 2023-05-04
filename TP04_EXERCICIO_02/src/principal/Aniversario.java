package principal;

public class Aniversario extends ClasseAbstrata {
	
	public Aniversario(String destinatario) {
		super(destinatario);
	}
	
	
	@Override
	public void ShowMessage() {
		super.MostraDestinatario();
		System.out.println("Feliz Aniversario!!" ); 
	}
	
}

