package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect;
		rect = new Rectangle();

		System.out.println("Enter Rectangle Widht and Height: ");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();
		System.out.println();
		double area = rect.area();
		double perimetro = rect.perimetro();
		double diagonal = rect.diagonal();
		
		System.out.printf("Area: %.2f", area);
		System.out.println();
		System.out.printf("Perimetro: %.2f", perimetro);
		System.out.println();
		System.out.printf("Diagonal: %.2f", diagonal);

		sc.close();

	}

}
