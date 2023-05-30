package exerciciosAula3;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número inteiro ou digite 0 para finalizar: ");
			numero = ler.nextInt();
			if (numero > 0) {
				soma = soma + numero;
			}
		}while (numero != 0);
			System.out.println("A soma dos números positivos é: " + soma);
		
		
	}

}
