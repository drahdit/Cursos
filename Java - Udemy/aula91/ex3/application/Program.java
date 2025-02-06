/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver.
*/

package aula91.ex3.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int x = sc.nextInt();
		
		String[] nome = new String[x];
		int[] idade = new int[x];
		double[] altura = new double[x];
		double somalt = 0.0;
		int menor16 = 0;
		String pMenor16 = "";
		
		for(int i = 0; i < x; i++) {
			int j = i + 1;
			System.out.print("Dados da " + j +  "a pessoa: \nNome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
			somalt += altura[i];
			
			if(idade[i] < 16) {
				menor16++;
				pMenor16 += "\n" + nome[i];
			}
		}
		double alturam = somalt / altura.length;
		double ppMenor16 = (menor16 * 100) / idade.length;
		
		System.out.println("\nAltura média: " + alturam);
		System.out.print("Pessoas com menos de 16 anos: " + ppMenor16);
		System.out.println(pMenor16);
		
		sc.close();
	}

}
