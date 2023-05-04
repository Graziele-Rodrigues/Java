package componentes;

public class Main {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(1, "Graziele Rodrigues");
		conta.deposita(100);
		conta.setLimite(100);
		try {
			conta.saca(150);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Exceção: " + e.getMessage());
		}
		
	}
}
