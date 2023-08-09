package entities;

public class Rectangle {

	public double height;
	public double width;

	public double area() {
		double a = height * width;
		return a;
	}

	public double perimetro() {
		double p = 2 * (height) + 2 * (width);
		return p;
	}
	
	public double diagonal() {
		double d = Math.sqrt((height * height) + (width * width));
		return d;
	} 

}
