package aparelhos;

import services.AparelhoTelefonico;
import services.NavegadorInternet;
import services.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPaginaInternet() {
		System.out.println("Exibindo Página da Internet pelo Iphone");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba pelo Iphone");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Página pelo Iphone");
		
	}

	@Override
	public void realizarLigacao() {
		System.out.println("Realizando Ligação pelo Iphone");
		
	}

	@Override
	public void atenderLigacao() {
		System.out.println("Atendendo Ligação pelo Iphone");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("Iniciando Correio de Voz pelo Iphone");
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("Tocando Música pelo Iphone");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando Música pelo Iphone");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Música pelo Iphone");
		
	}

}
