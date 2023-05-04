package dados;

import java.io.OutputStream;
import java.util.ArrayList;

public class Container {
	private ArrayList<Pessoa>listadePessoas = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa p) {
		listadePessoas.add(p);
	}
	
	public void print(OutputStream o) throws Exception{
		for(Pessoa pessoa : listadePessoas) {
			pessoa.flush(o);
		}
	}
}
