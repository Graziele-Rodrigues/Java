package componentes;

public class Carro {
	 private String placa;
	 private String cor;
	 private int quantidadeDePneus;
	 private float valor;
	 private String modelo;
	 
	 public void setPlaca(String placa) {
		 this.placa = placa;
	 }
	 
	 public String getPlaca() {
		 return this.placa;
	 }
	 
	 
	 public void setcor(String cor) {
		 this.cor = cor;
	 }
	 
	 public String getcor() {
		 return this.cor;
	 }

	 
	 public int getQuantidadeDePneus() {
		return quantidadeDePneus;
	 }
	
	 public void setQuantidadeDePneus(int quantidadeDePneus) {
		this.quantidadeDePneus = quantidadeDePneus;
	 }
	
	 
	 public float getValor() {
		return valor;
	 }
	
	 public void setValor(float valor) {
		this.valor = valor;
	 }
	
	 
	 public String getModelo() {
		return modelo;
	 }
	
	 public void setModelo(String modelo) {
		this.modelo = modelo;
	 }
	 
}
