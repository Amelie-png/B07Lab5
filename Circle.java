package lab4;

public class Circle {
	Point C;
    double radius;
	
	public Circle(Point C, double radius) {
        this.radius = Math.abs(radius);
		this.C = C;
	}
	
	public double perimeter() {
		return 2*radius*Math.PI;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}
}
