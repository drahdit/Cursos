/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média 
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for 
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

package aula91.ex8.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int x = sc.nextInt();
		
		int[] vect = new int[x];
		int npares = 0;
		int spares = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				spares += vect[i];
				npares++;
			}
		}
		if(npares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			double media = spares / npares;
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		}
		
		sc.close();
	}

}
