package pessoas;

public class CriarAluno {
	public static void main(String[] args) {

		Aluno novoAluno = new Aluno("2021.1.8120", "Graziele");
		novoAluno.setCurso("Eng. Computação");
		System.out.println(novoAluno.getMatricula());
		System.out.println(novoAluno.getNome());
		System.out.println(novoAluno.getCurso());
		
		
		Aluno novoAluno2 = new Aluno("2021.1.8120", "Laura");
		novoAluno2.setCurso("Eng. Computação");
		System.out.println(novoAluno2.getMatricula());
		System.out.println(novoAluno2.getNome());
		System.out.println(novoAluno2.getCurso());
	}
	
}
