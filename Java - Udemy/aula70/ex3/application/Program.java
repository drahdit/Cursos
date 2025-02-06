package aula70.ex3.application;

import java.util.Scanner;

import aula70.ex3.entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student x = new Student();
		
		x.name = sc.nextLine();
		x.n1 = sc.nextDouble();
		x.n2 = sc.nextDouble();
		x.n3 = sc.nextDouble();
		
		sc.close();
		
		System.out.println("FINAL GRADE = " + x.finalGrade());
		System.out.println(x.result());
	}

}
