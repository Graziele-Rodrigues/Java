package componentes;

public class TomadaAdapter extends TomadaDoisPinos{
	private TomadaTresPinos tomadaTresPinos;
	
	public TomadaAdapter(TomadaTresPinos tomadaTresPinos) {
		this.tomadaTresPinos = tomadaTresPinos;
	}

	public void ligarNaTomadaDoisPinos(){
		tomadaTresPinos.ligarNaTomadaDeTresPinos();
	}
}

