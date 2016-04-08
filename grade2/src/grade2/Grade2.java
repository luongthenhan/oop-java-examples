package grade2;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		System.out.println("Enter a grade: ");
		Scanner scan = new Scanner(System.in);
		int grade = Integer.parseInt(scan.nextLine());

		switch (grade) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Failed");
			break;
		case 6:
		case 7:
			System.out.println("Rather good");
			break;
		case 8:
			System.out.println("Good");
			break;
		case 9:
			System.out.println("Excellent");
			break;
		case 10:
			System.out.println("Outstanding");
			break;
		default:
			break;
		}
		scan.close();

	}

}
