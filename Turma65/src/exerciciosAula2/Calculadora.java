package exerciciosAula2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		float num1, num2, resultado;
		int operacao;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextFloat();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextFloat();
		
		System.out.println("Digite o código da operação (1 a 4):");
        	System.out.println("1 - Soma");
        	System.out.println("2 - Subtração");
       		System.out.println("3 - Multiplicação");
        	System.out.println("4 - Divisão");
        	operacao = ler.nextInt();
        
		switch (operacao) {
			case 1:
				resultado = num1 + num2;
				System.out.println("Resultado: " + resultado);
				break;

			case 2:
				resultado = num1 - num2;
				System.out.println("Resultado: " + resultado);
				break;

			case 3:
				resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
				break;

			case 4:
				resultado = num1 / num2;
				System.out.println("Resultado: " + resultado);
				break;
			default:
				System.out.println("Operação Inválida!");
		}
	}

}
