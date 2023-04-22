package aparelhos;

import services.AparelhoTelefonico;
import services.NavegadorInternet;
import services.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPaginaInternet() {
		System.out.println("Exibindo P�gina da Internet pelo Iphone");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba pelo Iphone");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando P�gina pelo Iphone");
		
	}

	@Override
	public void realizarLigacao() {
		System.out.println("Realizando Liga��o pelo Iphone");
		
	}

	@Override
	public void atenderLigacao() {
		System.out.println("Atendendo Liga��o pelo Iphone");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando Correio de Voz pelo Iphone");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando M�sica pelo Iphone");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando M�sica pelo Iphone");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando M�sica pelo Iphone");
		
	}

}
