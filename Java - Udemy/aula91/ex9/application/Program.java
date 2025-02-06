/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes 
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome 
 * da pessoa mais velha.
 */

package aula91.ex9.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar?");
		int x = sc.nextInt();
		
		String[] nomes = new String[x];
		int[] idades = new int[x];
		String pMaisVelha = "";
		int idadeMaior = 0;
		
		for(int i = 0; i < x; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			if(idades[i] > idadeMaior) {
				idadeMaior = idades[i];
				pMaisVelha = nomes[i];
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + pMaisVelha);
		
		sc.close();
	}

}
