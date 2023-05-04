package componentes;

public class Lanchonete {
	String Pao;
	String Queijo;
	String Presunto;
	String Salada;
	
	
	public Lanchonete(String pao, String queijo, String presunto, String salada) {
		Pao = pao;
		Queijo = queijo;
		Presunto = presunto;
		Salada = salada;
	}
	
	public String getPao() {
		return Pao;
	}
	public void setPao(String pao) {
		Pao = pao;
	}
	public String getQueijo() {
		return Queijo;
	}
	public void setQueijo(String queijo) {
		Queijo = queijo;
	}
	public String getPresunto() {
		return Presunto;
	}
	public void setPresunto(String presunto) {
		Presunto = presunto;
	}
	public String getSalada() {
		return Salada;
	}
	public void setSalada(String salada) {
		Salada = salada;
	}
	
	@Override
	public String toString() {
		return "Lanchonete [Pao=" + Pao + ", Queijo=" + Queijo + ", Presunto=" + Presunto + ", Salada=" + Salada + "]";
	}
	
	
}
