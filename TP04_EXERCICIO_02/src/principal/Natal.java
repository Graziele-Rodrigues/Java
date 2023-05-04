package principal;

public class Natal extends ClasseAbstrata {
	
	public Natal(String destinatario) {
		super(destinatario);
	}
	
	@Override
	public void ShowMessage() {
		super.MostraDestinatario();
		System.out.println("Feliz Natal e boas festas!!"); 
	}
	
}
