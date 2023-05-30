package exerciciosAula2;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um valor inteiro: ");
		num = ler.nextInt();
		ler.close();
				
		if ((num > 0 ) && (num % 2 == 0))  {
			System.out.println("O Número " + num + " é par e positivo!");
		}
		else if ((num < 0 ) && (num % 2 != 0))  {
			System.out.println("O Número " + num + " é ímpar e negativo!");
		}
		else if ((num < 0 ) && (num % 2 == 0))  {
			System.out.println("O Número " + num + " é par e negativo!");
		}
		else if ((num > 0 ) && (num % 2 != 0))  {
			System.out.println("O Número " + num + " é ímpar e positivo!");
		}
	}

}
