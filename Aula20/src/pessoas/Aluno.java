package pessoas;

public class Aluno {
	private String matricula;
	private String nome;
	private String curso;
	private String[] listaDeDiscipilinas = new String[10];
	private int indiceDeDisciplina = 0;
	
	public void setMatricula(String matricula) {
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
	
	public void matricular(String disciplina) {
		if(this.estaMatriculado(disciplina)) {
			System.out.println("Ja esta matriculado "+disciplina);
			return;
		}
		if(indiceDeDisciplina < 10) {
			this.listaDeDiscipilinas[indiceDeDisciplina] = disciplina;
			indiceDeDisciplina++;
		}
		else {
			System.out.println("O aluno "+this.getNome()+"já esta matriculado em 10 disiciplinas");
		}
	}
	
	public boolean estaMatriculado(String disciplina) {
		for(int i=0; i<indiceDeDisciplina;i++) {
			if(this.listaDeDiscipilinas[i].equals(disciplina)) {
				return true;
			}
		}
		return false;
	}
	
	public String[] obterDisciplinasCursadas() {
		String disc[] = new String[indiceDeDisciplina];
		int cont=0;
		while (cont < disc.length) {
			disc[cont] = this.listaDeDiscipilinas[cont];
			cont++;
		}
		return disc; 
	}
}
