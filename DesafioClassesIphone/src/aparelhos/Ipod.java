package aparelhos;

import services.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

	@Override
	public void tocarMusica() {
		System.out.println("Tocando m�sica pelo Ipod");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando m�sica pelo Ipod");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando m�sica pelo Ipod");
		
	}

}
