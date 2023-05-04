package principal;

public class MostraFatores {
	public static void fatores(int fatores[], int num, int tam) {
		int i=0;
		int j=0;
		System.out.println("temos " + tam+" fatores");
		for(i=2;num>1;i++) {
			while(num%i==0) {
				System.out.println(i);
				num = num/i;
				fatores[j] = i;
				j++;
			}
		}
		System.out.println("------------------------------------------");
		System.out.print("[");
		for(int x=0; x<tam;x++) {
			System.out.print(fatores[x]+" ");
		}
		System.out.print("]");
	}
}
