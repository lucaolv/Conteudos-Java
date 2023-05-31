package ExerciciosAula5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ListarDados {

	public static void main(String[] args) {

		Set<Integer> setNumeros = new HashSet<>();
		Iterator<Integer> isetNumeros = setNumeros.iterator();
		Scanner ler = new Scanner(System.in);
		Integer num = Integer.valueOf(10);

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite 10 números inteiros não repetidos:");
			num = ler.nextInt();
			setNumeros.add(num);
		}
		System.out.println("\nLista de dados Set: " + setNumeros);
		
		System.out.println("\nLista de dados - Interface Iterator");

		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}
	}

}