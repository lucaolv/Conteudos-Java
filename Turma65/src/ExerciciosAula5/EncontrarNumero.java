package ExerciciosAula5;

import java.util.ArrayList;
import java.util.Scanner;

public class EncontrarNumero {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		int num, posicao;

		valores.add(2);
		valores.add(5);
		valores.add(1);
		valores.add(3);
		valores.add(4);
		valores.add(9);
		valores.add(7);
		valores.add(8);
		valores.add(10);
		valores.add(6);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = ler.nextInt();

		posicao = valores.indexOf(num);
		if (posicao != -1) {
			System.out.println("O número " + num + " está localizado na posição: " + posicao);
		} 
		else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
	}

}
