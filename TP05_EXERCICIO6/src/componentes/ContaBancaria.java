package componentes;

public class ContaBancaria {
	private int id;
	private String titular;
	private double saldo;
	private double limite;
	
	public ContaBancaria(int id, String titular) {
		this.id = id;
		this.titular = titular;
		this.saldo =0;
		this.limite = 0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void saca(double valor) {
		if(valor > this.saldo) {
			SaldoInsuficienteException e = new SaldoInsuficienteException("Saldo Insuficiente, tente um valor mais baixo");
			throw e;
		}
		this.saldo = this.saldo - valor;
	}
}
