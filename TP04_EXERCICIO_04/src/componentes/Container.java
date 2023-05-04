package componentes;

import java.io.OutputStream;
import java.util.ArrayList;

public class Container {
	private ArrayList<Form>listadeFormularios = new ArrayList<Form>();
	
	public void addForm(Form f) {
		listadeFormularios.add(f);
	}
	
	public void print(OutputStream o) throws Exception{
		for(Form form : listadeFormularios) {
			form.flush(o);
		}
	}
}
