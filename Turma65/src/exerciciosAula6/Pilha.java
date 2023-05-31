package exerciciosAula6;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		String nome;
		Integer num;

		System.out.print("\t\t##--Teste Estrutura de Menu--##\n\n");
		System.out.print("\t|---------------------------------------------|\n");
		System.out.print("\t|    Opção 1 - Adicionar Livros na pilha      |\n");
		System.out.print("\t|    Opção 2 - Listar todos os Livros         |\n");
		System.out.print("\t|    Opção 3 - Retirar Livro da pilha         |\n");
		System.out.print("\t|    Opção 0 - Sair                           |\n");
		System.out.print("\t|---------------------------------------------|\n");
		System.out.println("\nDigite o numero desejado: ");
		num = ler.nextInt();

		while (num != 0) {
			if (num == 1) {
				ler.nextLine();
				System.out.println("Digite o nome de um Livro: ");
				nome = ler.nextLine();
				pilha.add(nome);
				System.out.println("\nLivro Adicionado!");
			}
			else if (num == 2) {
				System.out.println("\nLista de Livros na pilha: \n" + pilha);
			}
			else if (num == 3) {
				if (pilha.isEmpty() == true) {
					System.out.println(pilha.isEmpty());
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println(pilha.pop());
					System.out.println("\n" + pilha);
					System.out.println("\nUm Livro foi retirado da pilha!");
				}
			}
			System.out.println("\nDigite um número: ");
			num = ler.nextInt();
		}

		System.out.println("Programa Finalizado!");
	}

}
