package pessoas;

public class CriaAluno {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Rafael");
		a1.setMatricula("2020.2.0001");
		a1.setCurso("Computacao");
		
		Aluno a2 = new Aluno();
		a2.setNome("Maria");
		a2.setMatricula("2021.1.0001");
		a2.setCurso("Eletrica");
		
		for(int i=0;i<10;i++) {
			a1.matricular("CSI032");
		}
		
		String lista[] = a1.obterDisciplinasCursadas();
		for(int i=0; i<lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
}
