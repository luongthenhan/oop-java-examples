package inheritance;

public class Bird extends Animal implements Walking, Flighting {

	public Bird(String name, String color) {
		super(name, color);
	}

	@Override
	public void flight() {
		System.out.println("I am bird.. i can flight");
		
	}

	@Override
	public void walk() {
		System.out.println("I can walk too");	
	}

	@Override
	public void speak() {
		System.out.println("bla bla");	
		
	}

}
