package aula73.application;

import java.util.Scanner;

import aula73.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price?");
		CurrencyConverter.dolar = sc.nextDouble(); 
		System.out.println("How many dollars will be bought?");
		CurrencyConverter.bought = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.reais());

	}

}
