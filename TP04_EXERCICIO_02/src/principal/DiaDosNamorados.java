package principal;

public class DiaDosNamorados extends ClasseAbstrata {
	
	public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}
	
	@Override
	public void ShowMessage() {
		super.MostraDestinatario();
		System.out.println("amo você, feliz dia dos namorados!!"); 
	}
	
}
