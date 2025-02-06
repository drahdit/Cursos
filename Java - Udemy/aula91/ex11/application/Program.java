package aula91.ex11.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int x = sc.nextInt();
		
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double soma = 0;
		int nHomens = 0;
		int nMulheres = 0;
		
		for(int i = 0; i < x; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			double altura = sc.nextDouble();
			
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			sc.nextLine();
			String genero = sc.nextLine();
			
			if(genero.equalsIgnoreCase("F")) {
				soma += altura;	
				nMulheres++;
			}
			if(altura > maior) {
				maior = altura;
			}
			if(altura < menor) {
				menor = altura;
			}
			if(genero.equalsIgnoreCase("M")) {
				nHomens++;
			}
		}
		double media = soma / nMulheres;
		
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f", media);
		System.out.println("\nNumero de homens = " + nHomens);
		
		sc.close();
	}

}
