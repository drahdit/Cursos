package aula70.ex1.entities;

public class Rectangle {
	public double width;
	public double height;

	public double Area() {
		return width * height;
	}
	public double Perimeter() {
		return width * 2 + height * 2;
	}
	public double Diagonal() {
		return Math.sqrt(Math.pow(2, width) + Math.pow(2, height));
	}
}
