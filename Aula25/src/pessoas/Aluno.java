package pessoas;

public class Aluno {
	private String matricula;
	private String nome;
	private String curso;
	
	private static int contadorDeAlunos = 0;
	
	public Aluno(String matricula, String nome) { //Construtor
		Aluno.contadorDeAlunos++;
		this.matricula = matricula;
		this.nome = nome;
		System.out.println(Aluno.contadorDeAlunos);
	}
	
	
	public void setMatricula(String matricula) {
		//incluir regra de negocios é no set
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	
}
