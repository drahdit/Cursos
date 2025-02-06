/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a média dos elementos do vetor.
*/

package aula91.ex2.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos número você vai digitar? ");
		int x = sc.nextInt();
		
		double[] vect = new double[x];
		String valores = "Valores =";
		double soma = 0.0;
		
		for(int i = 0; i < x; i++) {
			System.out.print("Digite um número: ");
			sc.nextLine();
			vect[i] = sc.nextDouble();
			
			valores += " " + vect[i];
			soma += vect[i];
		}
		double media = soma / x;
		
		System.out.println(valores);
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);
		sc.close();
	}

}
