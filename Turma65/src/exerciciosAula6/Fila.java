package exerciciosAula6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		String nome;
		Integer num;

		System.out.print("\t\t##--Teste Estrutura de Menu--##\n\n");
		System.out.print("\t|---------------------------------------------|\n");
		System.out.print("\t|    Opção 1 - Adicionar Cliente na Fila      |\n");
		System.out.print("\t|    Opção 2 - Listar todos os Clientes       |\n");
		System.out.print("\t|    Opção 3 - Retirar Cliente da Fila        |\n");
		System.out.print("\t|    Opção 0 - Sair                           |\n");
		System.out.print("\t|---------------------------------------------|\n");
		System.out.println("\nDigite o numero desejado: ");
		num = ler.nextInt();

		while (num != 0) {
			if (num == 1) {
				System.out.println("Digite o nome: ");
				nome = ler.next();
				fila.add(nome);
				System.out.println("\nCliente Adicionado!");
			}
			else if (num == 2) {
				System.out.println("\nLista de Clientes na Fila: \n" + fila);
			}
			else if (num == 3) {
				if (fila.isEmpty() == true) {
					System.out.println(fila.isEmpty());
					System.out.println("A Fila está vazia!");
				} else {
					System.out.println(fila.poll());
					System.out.println("\nO Cliente foi Chamado!");
				}
			}
			System.out.println("\nDigite um número: ");
			num = ler.nextInt();
		}

		System.out.println("Programa Finalizado!");
	}

}
