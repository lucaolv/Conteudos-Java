package ExerciciosAula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cores {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String cor;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite uma cor: ");
			cor = ler.next();
			cores.add(cor);
		}
		System.out.println("\nLista de cores: " + cores);

		Collections.sort(cores);
		System.out.println("\nCores em ordem: " + cores);
	}

}