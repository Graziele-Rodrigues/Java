package componentes;

import java.util.ArrayList;

public class AppTeste {
	public static void main(String[] args) {
		//TomadaDoisPinos doisPinos = new TomadaDoisPinos();
		//TomadaTresPinos tresPinos = new TomadaTresPinos();
		//doisPinos.ligarNaTomadaDoisPinos();
		//tresPinos.ligarNaTomadaDeTresPinos();
		
		TomadaTresPinos tresPinos = new TomadaTresPinos();
		TomadaAdapter adapter = new TomadaAdapter(tresPinos);
		
		ArrayList<TomadaAdapter> listaDeObjs = new ArrayList<>();
		listaDeObjs.add(adapter);
		System.out.println(listaDeObjs);
		
	}
}
