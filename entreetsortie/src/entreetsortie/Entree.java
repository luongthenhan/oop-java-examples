package entreetsortie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Entree {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileIn = new Scanner(new File("D:\\temp\\fichier2.txt"));
		String line1 = fileIn.nextLine();
		System.out.println("line1 = " + line1);
		String line2 = fileIn.nextLine();
		System.out.println("line2 = " + line2);
		String line3 = fileIn.nextLine();
		System.out.println("line3 = " + line3);
		fileIn.close();
		
		// Ecrire dans un fichier
		PrintWriter pw = new PrintWriter("D:\\temp\\fichier3.txt");
		pw.println("First line");
		pw.println("Second line");
		pw.println("Third line");
		pw.close();
		
		/*
		System.out.println("Tapez ... ");
		Scanner in = new Scanner(System.in);
		
		String unMot = in.next();
		System.out.println("unMot = " + unMot);
		
		String unMot2 = in.next();
		System.out.println("unMot2 = " + unMot2);
		
		String unMot3 = in.next();
		System.out.println("unMot3 = " + unMot3);
		
		String unMot4 = in.next();
		System.out.println("unMot4 = " + unMot4);
		
		String line = in.nextLine();
		System.out.println("line = " + line);

		int unNombre = in.nextInt();
		System.out.println("unNombre = " + unNombre);
		*/
	}

}
