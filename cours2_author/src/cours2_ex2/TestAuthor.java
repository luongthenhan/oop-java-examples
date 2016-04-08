package cours2_ex2;

public class TestAuthor {

	public static void main(String[] args) {
		Author anAuthor = new Author("Tan Ah Teck", 
				"ahteck@somewhere", 'm');
		System.out.println(anAuthor);
		anAuthor.setEmail("paul@nowhere.com");
		System.out.println(anAuthor);
	}

}
