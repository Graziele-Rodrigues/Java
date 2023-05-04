package principal;

public class Estoque {
	private String nomePlanta;
	private int estoqueIdeal;
	private int estoqueDisponivel;
	
	public void setNomePlanta(String nomePlanta) {
		this.nomePlanta = nomePlanta;
	}
	
	public String getNomePlanta() {
		return this.nomePlanta; 
	}
	
	public void setEstoqueIdeal(int estoqueIdeal) {
		this.estoqueIdeal = estoqueIdeal;
	}
	
	public int getEstoqueIdeal() {
		return this.estoqueIdeal; 
	}
	
	public void setEstoqueDisponivel(int estoqueDisponivel) {
		this.estoqueDisponivel = estoqueDisponivel;
	}
	
	public int getEstoqueDisponivel() {
		return this.estoqueDisponivel; 
	}
}
