package componentes;


public class MedidorAdapter implements MedirCelsiusIF {
	
	private static MedidorFarenheit temp = new MedidorFarenheit();

	public double medirTemperatura() {
		return (temp.getTemperaturaFarenheit()-32)/1.8;
	}
}
