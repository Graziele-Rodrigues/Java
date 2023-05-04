package componentes;

public class LanchoneteFactory {
	public static Lanchonete Cria() {
		String nomeLanchonete = "rt";
		if(nomeLanchonete.equalsIgnoreCase("CG")) {
			return new LanchoneteCG("Integral", "Prato", "De Frango", "Sem verdura");
		}
		else if(nomeLanchonete.equalsIgnoreCase("JP")) {
			return new LanchoneteJP("Frances", "Mussarela", "De Frango", "Com verdura");
		}
		else if(nomeLanchonete.equalsIgnoreCase("RT")){
			return new LanchoneteRT("Bola", "Cheddar", "De Peru", "Sem verdura");
		}
		else {
			return null;
		}
	}
}
