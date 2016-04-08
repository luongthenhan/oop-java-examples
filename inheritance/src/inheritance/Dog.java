package inheritance;

public class Dog extends Animal implements Walking {

	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public void speak() {
		System.out.println("Gau gau");
		
	}
	
	@Override
	public void walk() {
		System.out.println("I can walking.. gau gau");
	}

}
