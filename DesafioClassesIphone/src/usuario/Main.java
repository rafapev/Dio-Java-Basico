package usuario;

import aparelhos.Iphone;
import aparelhos.Ipod;
import provedorInternet.Safari;
import services.ReprodutorMusical;



public class Main {
	
	public static void main(String[] args) {
		
		ReprodutorMusical ipod = new Ipod();
		ipod.tocarMusica();
		
		Safari safari = new Safari();
		safari.exibirPaginaInternet();
		
		Iphone iphone = new Iphone();
		iphone.tocarMusica();
		iphone.exibirPaginaInternet();
		iphone.realizarLigacao();
		
		
	}

}
