/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um 
 * terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima 
 * o vetor C gerado.
 */

package aula91.ex6.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int x = sc.nextInt();
		
		int[] vect = new int[x];
		int[] vect2 = new int[x];
		
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < x; i++) {
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < x; i++) {
			vect2[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i] + vect2[i]);
		}
		
		sc.close();
	}

}
