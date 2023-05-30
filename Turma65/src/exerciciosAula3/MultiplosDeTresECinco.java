package exerciciosAula3;

import java.util.Scanner;

public class MultiplosDeTresECinco {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int i, num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		if(num2 > num1) {
			for(i = num1; i < num2; i++) {
				if(i % 3 == 0 && i % 5 == 0 && i != 0) {
					System.out.println(i + " é múltiplo de 3 e 5.");
				}
			}
		}else {
			System.out.println("Intervalo inválido");
		}
		
	}

}