package principal;

public class Main {
	public static void fazAlgo() {
		System.out.println("Faz Algo");
	}
	
	public static int soma(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	public static void main(String[] args) {
		
		fazAlgo();
		
		int a=10;
		int b=20;
		int res = soma(a,b);
		System.out.println(res);
	}
}