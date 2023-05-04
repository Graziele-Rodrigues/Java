package componentes;

public class Grafo {
	private int valor;
	
	public Grafo() {
		this.valor=0;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public void setValor(int valor) { //adicionar regra de negocio aqui, se necessario
			this.valor = valor;
	}
}
