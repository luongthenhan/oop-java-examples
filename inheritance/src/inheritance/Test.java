package inheritance;

public class Test {

	public static void main(String[] args) {
		//Animal a = new Animal("kiki", "blue");
		//a.speak();
		
		Dog d = new Dog("chiwawa", "yellow");
		d.speak();
		d.walk();
		
		Cat c = new Cat("meo", "black");
		c.speak();
		c.walk();
		
		Bird b = new Bird("a", "b");
		b.speak();
		b.walk();
		b.flight();
	}

}
