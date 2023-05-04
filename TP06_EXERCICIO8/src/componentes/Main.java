package componentes;

public class Main {
	public static void main(String[] args) {
	MedidorFarenheit temperatura = new MedidorFarenheit();
	MedidorAdapter temp = new MedidorAdapter();
	System.out.println("Farenheit: " + temperatura.getTemperaturaFarenheit());
	System.out.println("Celsius: " + temp.medirTemperatura());
	}
}
