package componentes;

import java.io.OutputStream;

public class Form {
	private String nome;
	private int idade;
	private String cpf;
	
	public Form(String nome, int idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		String str = "Nome: " + getNome();
		str += "Idade: " + getIdade();
		str += "Cpf: " + getCpf();
		return str;
	}
	
	
	public void flush(OutputStream o) throws Exception{
		o.write(toString().getBytes());
	}
}

