package aula70.ex3.entities;

public class Student {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double finalGrade(){
		return n1 + n2 + n3;
	}
	public String result() {
		if(finalGrade() >= 60.0) {
			return "Pass";
		}else {
			return "Failed \nMissing " + (60 - finalGrade()) + " points";
		}
	}
}
