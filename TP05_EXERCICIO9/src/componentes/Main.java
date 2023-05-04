package componentes;

public class Main {
	public static void main(String args[]) {
		try {
			method1();
		}
		catch(Exception exception) {
			exception.printStackTrace();;
		}
	}
	
	public static void method1() throws Exception{
		try {
			method2();
		}
		catch(Exception exception) {
			throw new Exception("Exception thwown in method1", exception);
		}
	}
	
	public static void method2() throws Exception{
			throw new Exception("Exception thwown in method2");
	}
	
}
