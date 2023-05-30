package ExerciciosAula4;

import java.util.Iterator;

public class MatrizDiagonal {

	public static void main(String[] args) {

        int somaPrincipal = 0, somaSecundaria = 0, matriz[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
        System.out.println("Elementos da diagonal principal:");        
        for(int linha = 0; linha < matriz.length; linha++) {
			System.out.print(matriz[linha][linha] + " ");				
        }
		        
        System.out.println("\n\nElementos da diagonal Secundária:");
        for(int linha = 0; linha < matriz.length; linha++) {
            System.out.print(matriz[linha][matriz.length-1-linha] + " ");
        }
        
        System.out.println("\nResultado da soma principal: ");
        for (int linha = 0; linha < matriz.length; linha++) {
			somaPrincipal = somaPrincipal + matriz[linha][linha];
		}
        System.out.println(somaPrincipal);
        
        System.out.println("Resultado da soma secundária: ");
        for (int linha = 0; linha < matriz.length; linha++) {
			somaSecundaria = somaSecundaria + matriz[linha][matriz.length - linha - 1];
		}
        System.out.println(somaSecundaria);
	}
}
