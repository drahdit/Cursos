package aula70.ex1.application;

import java.util.Scanner;
import aula70.ex1.entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Rectangle x = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();
		
		System.out.println("AREA = " + x.Area());
		System.out.println("PERIMETER = " + x.Perimeter());
		System.out.println("DIAGONAL = " + x.Diagonal());
		
		sc.close();
	}

}
