package principal;

public class Main {
	public static void main(String[] args) {
		System.out.println(recursao(6));
	}
	public static int recursao(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return recursao(n-1)+(2*(n-1)+3*(n-2));
		}
	}
}