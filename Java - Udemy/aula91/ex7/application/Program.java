/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, 
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos 
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/

package aula91.ex7.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int x = sc.nextInt();
		
		double[] vect = new double[x];
		double media = 0.0;
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
			media += vect[i];
		}
		media /= vect.length;
		
		String abaixom = "\nELEMENTOS ABAIXO DA MEDIA:";
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < media) {
				abaixom += "\n" + vect[i];
			}
		}
		System.out.println("MEDIA DO VETOR = " + media + abaixom);
		
		sc.close();
	}

}
