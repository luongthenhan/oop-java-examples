package cours2_ex1;

public class Circle {
	private double radius;
	private String color;
	
	public Circle(){
		radius = 1.0;
		color = "blue";
	}
	
	public Circle(double r) {
		radius = r;
		color = "blue";
	}
	
	public Circle(double r, String c) {
		radius = r;
		color = c;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

}
