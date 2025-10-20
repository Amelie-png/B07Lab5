package lab4;

public class Circle {
	Point C;
    int radius;
	
	public Circle(Point C, int radius) {
		this.radius = radius;
		this.C = C;
	}
	
	public double perimeter() {
		return 2*radius*Math.PI;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
}
