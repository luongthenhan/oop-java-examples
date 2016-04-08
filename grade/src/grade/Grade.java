package grade;

import java.util.Scanner;

public class Grade {

	public static void main(String args[]) {
		String test = "abc";
		test = test + test;
		System.out.println(test);
		
		System.out.println("Enter a grade: ");
		Scanner scan = new Scanner(System.in);
		int grade = Integer.parseInt(scan.nextLine());

		if (grade < 5) {
			System.out.println("Failed");
		} else if (grade < 7) {
			System.out.println("Rather good");
		} else if (grade < 8) {
			System.out.println("Good");
		} else if (grade < 8) {
			System.out.println("Excellent");
		} else {
			System.out.println("Outstanding");
		}

		scan.close();
	}

}
