package arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample2 {
	public static void main(String args[]) {
		// Creating an empty array list
		ArrayList<String> list = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);
		String action = "";
		do {
			if (action.equalsIgnoreCase("A")) {
				// Adding items to arrayList
				System.out.println("Enter a name to insert: ");
				String name = scan.nextLine();
				list.add(name);
			} else if (action.equalsIgnoreCase("D")) {
				System.out.println("Enter an index to delete: ");
				try {
					int idx = scan.nextInt();
					if (idx >= 0 && idx < list.size()) {
						System.out.println("Remove index " + idx);
						list.remove(idx);
					} else {
						System.out.println("Element doesn't exist at index " + idx);
					}
					
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			} else if (!action.equals("")) {
				System.out.println("Invalid action.");
			}
			
			// Display the contents of the array list
			System.out.println("The arraylist contains the following elements: " + list);
			
			
			System.out.println("Actions : A to add element, D to delete element, Q to quit");
			action = scan.nextLine();
		} while (!action.equalsIgnoreCase("Q"));

		scan.close();
	}
}
