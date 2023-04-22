package aparelhos;

import services.ReprodutorMusical;

public class Ipod implements ReprodutorMusical{

	@Override
	public void tocarMusica() {
		System.out.println("Tocando música pelo Ipod");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando música pelo Ipod");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música pelo Ipod");
		
	}

}
