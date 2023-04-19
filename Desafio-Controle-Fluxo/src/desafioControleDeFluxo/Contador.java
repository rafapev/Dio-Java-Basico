package desafioControleDeFluxo;

import java.util.Scanner;

public class Contador {
	
		public static void main(String[] args) {
			
			Scanner terminal = new Scanner(System.in);
			
			System.out.print("Digite o primeiro parâmetro: ");
			int parametroUm = terminal.nextInt();
			
			System.out.print("Digite o segundo parâmetro: ");
			int parametroDois = terminal.nextInt();
			
			try {
				//chamada do método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException exception) {
				//imprimir a mensagem de exception
				System.out.print("O segundo parâmetro deve ser maior que o primeiro");
			}
			
			terminal.close();
		}
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			if(parametroUm > parametroDois) {
				throw new ParametrosInvalidosException();
			}
			
			int contagem = parametroDois - parametroUm;
			//realizar o laço for para imprimir os números com base na variável contagem
			for(int i =0; i < contagem; i++) {
				System.out.println("Imprimindo o número " + (i+1));
			}
		}
}
