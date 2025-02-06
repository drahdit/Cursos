package aula70.ex2.application;

import java.util.Scanner;
import aula70.ex2.entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee x = new Employee();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Gross salray: ");
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println("Employee: " + x);
		System.out.print("Whitch percentage to increase salary? ");
		x.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + x);
		
		sc.close();
	}

}
