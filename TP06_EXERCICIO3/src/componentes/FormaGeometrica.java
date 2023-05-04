package componentes;

public class FormaGeometrica {
	private Forma forma;
	public FormaGeometrica(String forma) {
		this.forma = FormaFactory.DesenharForma(forma);
	}
	
	public Forma getForma() {
		return this.forma;
	}
}
