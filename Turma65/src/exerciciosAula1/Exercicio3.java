package exerciciosAula1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		float salBruto, adcNoturno, hExtra, descontos, saLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salário bruto: ");
		salBruto = leia.nextFloat();
		
		System.out.println("Digite seu adicional noturno: ");
		adcNoturno = leia.nextFloat();
		
		System.out.println("Digite suas horas extras: ");
		hExtra = leia.nextFloat();
		
		System.out.println("Digite seus descontos: ");
		descontos = leia.nextFloat();
		
		saLiquido = salBruto + adcNoturno + (hExtra * 5) - descontos;
		
		System.out.printf("Seu salário liquído foi de: %.2f", saLiquido);
	}

}
