package desafioControleDeFluxo;

import java.util.Scanner;

public class Contador {
	
		public static void main(String[] args) {
			
			Scanner terminal = new Scanner(System.in);
			
			System.out.print("Digite o primeiro par�metro: ");
			int parametroUm = terminal.nextInt();
			
			System.out.print("Digite o segundo par�metro: ");
			int parametroDois = terminal.nextInt();
			
			try {
				//chamada do m�todo contendo a l�gica de contagem
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException exception) {
				//imprimir a mensagem de exception
				System.out.print("O segundo par�metro deve ser maior que o primeiro");
			}
			
			terminal.close();
		}
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			//validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
			if(parametroUm > parametroDois) {
				throw new ParametrosInvalidosException();
			}
			
			int contagem = parametroDois - parametroUm;
			//realizar o la�o for para imprimir os n�meros com base na vari�vel contagem
			for(int i =0; i < contagem; i++) {
				System.out.println("Imprimindo o n�mero " + (i+1));
			}
		}
}
