package cours2_ex1;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle(3.0, "red");
		
		System.out.println("Circle c1 = " 
				+ c1.toString());
		
		System.out.println("Circle c1 has area = " 
				+ c1.getArea());
		
		System.out.println("Circle c2 has: radius = " 
				+ c2.getRadius() + " and color = " + c2.getColor());
		
		System.out.println("Circle c3 has: radius = " 
				+ c3.getRadius() + " and color = " + c3.getColor());
	}

}
