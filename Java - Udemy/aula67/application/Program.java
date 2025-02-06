package aula67.application;

import java.util.Scanner;

import aula67.entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product y = new Product();
			
		System.out.println("Qual o nome do produto?");
		y.name = sc.nextLine();
			
		System.out.println("Qual o preço do produto?");
		y.price = sc.nextDouble();
			
		System.out.println("Qual a quantidade desse produto no estoque?");
		y.quantity = sc.nextInt();
			
		sc.close();
		System.out.println("Nome do produto: " + y.name + "\nPreço do produto: R$" + String.format("%.2f",  y.price) + "\nQuantidade do produto no estoque: " + y.quantity + "\nValor total em estoque: R$" + String.format("%.2f", y.TotalValueInStock()));
		y.RemoveProducts(4);
		System.out.println(y.quantity);
		
	}

}
