package principal;

public class DiaDosNamorados extends ClasseAbstrata {
	
	public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}
	
	@Override
	public void ShowMessage() {
		super.MostraDestinatario();
		System.out.println("amo voc�, feliz dia dos namorados!!"); 
	}
	
}
