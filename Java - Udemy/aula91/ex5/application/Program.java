/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
 * o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
 * considerando a primeira posição como 0 (zero). 
 */

package aula91.ex5.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int x = sc.nextInt();
		
		double[] valores = new double[x];
		
		for(int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble();
		}
		double maiorv = Double.MIN_VALUE;
		int posicao = 0;
		
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] > maiorv) {
				maiorv = valores[i];
				posicao = i;
			}
			
		}
		
		System.out.println("\nMAIOR VALOR = " + maiorv);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
		sc.close();
	}

}
