package desafioContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor, digite seu nome: ");
		String nomeCliente = entrada.next();
		
		System.out.print("Por favor, digite sua ag�ncia: ");
		String numeroAgencia = entrada.next();
		
		System.out.print("Por favor, digite o n�mero da conta: ");
		String numeroConta = entrada.next();
		
		System.out.print("Por favor, digite seu saldo: ");
		double saldo = entrada.nextDouble();
		
		System.out.printf("Ol� %s, obrigado por criar uma conta em nosso banco,"
				+ " sua ag�ncia � %s, conta %s e seu saldo %.2f j� est� dispon�vel para saque"
				, nomeCliente, numeroAgencia, numeroConta, saldo);
		
		
		entrada.close();
	}

}
