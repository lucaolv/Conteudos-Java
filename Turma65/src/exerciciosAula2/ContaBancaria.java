package exerciciosAula2;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		float saldo = 1000, saque, deposito, valor;
		int operacao;
		
		System.out.println("Digite o código da operação (1 a 3):");
		System.out.println("1 - Consultar saldo");
		System.out.println("2 - Efetuar saque");
		System.out.println("3 - Depositar valor");
		operacao = ler.nextInt();

		switch (operacao) {
			case 1:
				System.out.println("Saldo atual: R$" + saldo);
				break;
			case 2:
				System.out.println("Informe o valor a ser sacado: ");
				valor = ler.nextFloat();
				if (saldo >= valor) {
					saldo -= valor;
				System.out.println("Novo saldo: R$ " + saldo);
					}else {
			    System.out.println("Saldo insuficiente! Operação cancelada.");	
					}        		
				break;
			case 3:
				System.out.println("Informe o valor a ser depositado:");
				valor = ler.nextFloat();
				saldo += valor;
				System.out.println("Novo saldo: RS$ " + saldo);
				break;
		    	default:
				System.out.println("Operação inválida!");

		}
	}
}
