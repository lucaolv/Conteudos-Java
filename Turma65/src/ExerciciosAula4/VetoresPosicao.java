package ExerciciosAula4;

import java.util.Iterator;
import java.util.Scanner;

public class VetoresPosicao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int posicao, vetor[] = {2,5,1,4,5,9,7,8,10,6};
		
		System.out.println("Digite um número para pesquisar a posição: ");
		posicao = ler.nextInt();
		
		for(int i = 0; i < vetor.length; i++) {
			if(posicao == vetor[i]) {
				System.out.println("O número " + posicao + " está localizado na posição " + i);
				return;
			}
		}
		System.out.println("O número " + posicao + " não foi encontrado!");
	}

}
