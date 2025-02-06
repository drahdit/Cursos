package aula82.application;

import java.util.Scanner;

import aula82.entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número da conta: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Insira seu nome: ");
		String nameAccount = sc.next();
		
		System.out.print("Você gostaria de adicionar dinheiro à sua conta agora (y/n)? ");
		String escolha = sc.next();
		
		double depositAmount = 0;
		
		if(escolha.equals("y")) {
			System.out.print("Enter a initial deposit value: ");
			depositAmount = sc.nextDouble();
		}
		
		BankAccount x = new BankAccount(numberAccount, nameAccount, depositAmount);
		
		System.out.print("\nAccount data:\n" + x + "\n\nEnter a deposit value: ");
		x.addDepositAmount(sc.nextDouble());
		
		System.out.print("Updated Account data:\n" + x + "\n\nEnter a withdraw value: ");
		x.withdraw(sc.nextDouble());
		
		System.out.print("Updated Account data:\n" + x);
		
		sc.close();
	}

}
