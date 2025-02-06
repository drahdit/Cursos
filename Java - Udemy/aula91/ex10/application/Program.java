package aula91.ex10.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos alunos serao digitados? ");
		int x = sc.nextInt();
		
		String[] nomes = new String[x];
		double[] n1 = new double[x];
		double[] n2 = new double[x];
		String aprovados = "Alunos aprovados:";
		
		for(int i = 0; i < x; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
			if((n1[i] + n2[i]) / 2 >= 6) {
				aprovados += "\n" + nomes[i];
				}
			}
		System.out.println(aprovados);
		
		sc.close();
	}

}
