package principal;

import componentes.Carro;

public class TestaCarro {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setPlaca("XXX0000");
		c1.setcor("vermelho");
		c1.setValor(10000);
		c1.setModelo("uno");
		c1.setQuantidadeDePneus(5);
		
		Carro c2 = new Carro();
		c2.setPlaca("YY0000");
		c2.setcor("preto");
		c2.setValor(15000);
		c2.setModelo("Ferrari");
		c2.setQuantidadeDePneus(4);
		
		System.out.println(c1.getPlaca());
		System.out.println(c2.getValor());
		
	}
}
