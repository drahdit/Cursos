/*
 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
 * e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

package aula91.ex1.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos número você vai digitar? ");
		int x = sc.nextInt();
		
		int[] vect = new int[x];
		
		String negativos = "NUMEROS NEGATIVOS:";
		
		for(int i = 0; i < x; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			
			if(vect[i] < 0) {
				negativos += "\n" + vect[i];
			}
		}
		
		System.out.println(negativos);
		sc.close();
	}

}
