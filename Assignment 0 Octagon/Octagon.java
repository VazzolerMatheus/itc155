package itc155;
import java.lang.Math;

public class Octagon implements Shape{
		
	private double side;
	
	public Octagon(double side) {
		this.side = side;
	}
	public double getArea() {
	
		return 2 * (1 + Math.sqrt(2)) * (side * side);
	}
	
	public double getPerimeter() {
		return side * 8;
	}
}

