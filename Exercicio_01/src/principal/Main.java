package principal;


public class Main {
	public static void main(String[] args) {
		Funcionarias f1 = new Funcionarias();
		
		f1.setPes(500);
		f1.setMaos(1000);
		f1.setPodologia(1000);
		
		System.out.println("O salario da funcionaria 1 é R$"+ salario(f1.getPes(), f1.getMaos(), f1.getPodologia()));
		
		Funcionarias f2 = new Funcionarias();
		
		f2.setPes(500);
		f2.setMaos(600);
		f2.setPodologia(500);
		
		System.out.println("O salario da funcionaria 2 é R$"+ salario(f2.getPes(), f2.getMaos(), f2.getPodologia()));
		
		Funcionarias f3 = new Funcionarias();
		
		f3.setPes(800);
		f3.setMaos(1000);
		f3.setPodologia(2000);
		
		System.out.println("O salario da funcionaria 3 é R$"+ salario(f3.getPes(), f3.getMaos(), f3.getPodologia()));
		
		Funcionarias f4 = new Funcionarias();
		
		f4.setPes(1000);
		f4.setMaos(1000);
		f4.setPodologia(500);
		
		System.out.println("O salario da funcionaria 4 é R$"+ salario(f4.getPes(), f4.getMaos(), f4.getPodologia()));
		
		Funcionarias f5 = new Funcionarias();
		
		f5.setPes(300);
		f5.setMaos(300);
		f5.setPodologia(2500);
		
		System.out.println("O salario da funcionaria 5 é R$"+ salario(f5.getPes(), f5.getMaos(), f5.getPodologia()));
	}
	
	public static float salario(float pes, float maos, float podologia) {
		float salario = (float) (0.5*(pes+maos+podologia));
		return salario;
	}

}
