package provedorInternet;

import services.NavegadorInternet;

public class Safari implements NavegadorInternet {

	@Override
	public void exibirPaginaInternet() {
		System.out.println("Exibindo P�gina da Internet pelo Safari");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba pelo Safari");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando P�gina pelo Safari");
		
	}

}
