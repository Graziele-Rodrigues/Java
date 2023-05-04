package dados;

import java.io.OutputStream;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		String str = "Nome: " + getNome();
		str += "Idade: " + getIdade();
		return str;
	}
	
	
	public void flush(OutputStream o) throws Exception{
		o.write(toString().getBytes());
	}
}
