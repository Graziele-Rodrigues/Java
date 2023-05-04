package componentes;

public class Grade {
	private char simbolo;
	
	public Grade() { //construtor
		this.simbolo = ' ';
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
	
	public void setSimbolo(char simbolo) {
		if(this.simbolo == ' ') { //regra de negocio
			this.simbolo = simbolo; //se vazio, recebe valor passado
		}else {
			System.out.print("Grade já usada");
		}
	}
}	
