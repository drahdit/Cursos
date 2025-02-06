package aula70.ex2.entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		double acres = (grossSalary / 100) *  percentage;
		grossSalary += acres;
	}
	public String toString() {
		return name + ", $ " + netSalary();
	}
}
