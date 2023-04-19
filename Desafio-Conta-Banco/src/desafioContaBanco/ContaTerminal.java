package desafioContaBanco;

import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor, digite seu nome: ");
		String nomeCliente = entrada.next();
		
		System.out.print("Por favor, digite sua agência: ");
		String numeroAgencia = entrada.next();
		
		System.out.print("Por favor, digite o número da conta: ");
		String numeroConta = entrada.next();
		
		System.out.print("Por favor, digite seu saldo: ");
		double saldo = entrada.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,"
				+ " sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque"
				, nomeCliente, numeroAgencia, numeroConta, saldo);
		
		
		entrada.close();
	}

}
