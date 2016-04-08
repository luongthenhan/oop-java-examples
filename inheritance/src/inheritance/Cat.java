package inheritance;

public class Cat extends Animal implements Walking {

	public Cat(String name, String color) {
		super(name, color);
	}

	@Override
	public void speak() {
		System.out.println("Meo meo");
		
	}

	@Override
	public void walk() {
		System.out.println("I can walking.. meo meo");
	}

}
