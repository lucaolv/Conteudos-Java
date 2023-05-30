package exerciciosAula2;

import java.util.Scanner;

public class ValoresABC {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Digite o valor inteiro de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor inteiro de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor inteiro de C: ");
		c = ler.nextInt();
		ler.close();
		
		if ((a + b) > c ) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
		else if ((a + b) < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else {
			System.out.println("A Soma de A + B é Igual a C");
		}
	}

}
