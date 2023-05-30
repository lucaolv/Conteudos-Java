package exerciciosAula3;

import java.util.Scanner;

public class VerificarIdades {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
        int idade, idadeMenor = 0, idadeMaior = 0;

        System.out.println("Digite uma idade: ");
        idade = ler.nextInt();

        while (idade >= 0) {
        	
        	if(idade < 21) {
            	idadeMenor++;
            }
        	if(idade > 50) {
            	idadeMaior++;
            }
        	
        	System.out.println("Digite uma idade: ");
        	idade = ler.nextInt();
        	
        }      
        if(idade <=0) {
		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeMaior);
        }
	}

}
