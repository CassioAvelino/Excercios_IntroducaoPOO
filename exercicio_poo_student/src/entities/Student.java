package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double gradeSum;

	public double noteCalculation() {
		return gradeSum = grade1 + grade2 + grade3;
	}

	public double noteMissing(){
		return 60 - gradeSum;
	}
	
}
