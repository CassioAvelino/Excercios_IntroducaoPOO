package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Progran {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stu;
		stu = new Student();

		System.out.print("Name: ");
		stu.name = sc.nextLine();
		System.out.printf("Grade 1: ");
		stu.grade1 = sc.nextDouble();
		System.out.printf("Grade 2: ");
		stu.grade2 = sc.nextDouble();
		System.out.printf("Grade 3: ");
		stu.grade3 = sc.nextDouble();
		System.out.printf("Grade final: %.2f%n", stu.noteCalculation());


		if (stu.noteCalculation() > 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING: %.2f POINTS",stu.noteMissing());
		}

		sc.close();

	}

}
