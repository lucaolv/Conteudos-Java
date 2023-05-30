package exerciciosAula1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		float n1, n2, n3, n4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		n1 = leia.nextFloat(); 
		
		System.out.println("Digite sua segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Digite sua terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("Digite sua quarta nota: ");
		n4 = leia.nextFloat();

		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("Sua média de nota foi: %.1f", media);
		
	}

}
