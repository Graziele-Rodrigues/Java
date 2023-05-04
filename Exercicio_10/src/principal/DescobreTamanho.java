package principal;

public class DescobreTamanho {
	public static int Tamanho(int num, int tam) {
		for(int i=2;num>1;i++) {
			while(num%i==0) {
				tam++;
				num = num/i;
			}
		}
		return tam;
	}
}
