/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
 * tela todos os números pares, e também a quantidade de números pares.
 */

package aula91.ex4.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int x = sc.nextInt();
		
		int[] numbers = new int[x];
		int paresv = 0;
		int j = 0;
		
		for(int i = 0; i < x; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
			
			if(numbers[i] % 2 == 0) {
				paresv++;
			}
		}
		int[] pares = new int[paresv];
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				pares[j] = numbers[i];
				j++;
			}
		}
		String paresS = "\nNUMEROS PARES:\n";
		
		for(int i = 0; i < pares.length; i++) {
			paresS += pares[i] + "  ";
		}
		
		System.out.println(paresS);
		System.out.println("\nQUANTIDADE DE PARES = " + pares.length);
		
		sc.close();
	}

}
