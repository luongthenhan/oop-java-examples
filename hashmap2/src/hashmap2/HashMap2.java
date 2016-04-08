package hashmap2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {

		try {
			Scanner s = new Scanner(new File("text.txt"));
			ArrayList<String> list = new ArrayList<String>();
			while (s.hasNext()) {
				String tmp = s.next();
				while (tmp.endsWith(".") || tmp.endsWith(",")) {
					tmp = tmp.substring(0, tmp.length() - 1);
				}
				tmp = tmp.toLowerCase();
				list.add(tmp);
			}
			s.close();

			// Display the contents of the array list
			System.out.println("The arraylist contains the "
					+ "following elements: " + list);
			System.out.println();
			
			Collections.sort(list);

			// Display the contents of the array list
			System.out.println("The arraylist after "
					+ "sorting contains the following elements: " + list);
			System.out.println();
			
			// Using hashmap to count the words
			HashMap<String, Integer> hmap = new HashMap<String, Integer>();
			for (String word : list) {
				if (!hmap.containsKey(word)) {
					hmap.put(word, 1);
				} else {
					hmap.put(word, hmap.get(word) + 1);
				}
			}

			/* Display content using Iterator */
			// using the keySet function to get the set of keys
			Set<String> set = hmap.keySet();

			// using Iterator in order to cross the set
			Iterator<String> it = set.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.print("The occurrence of the word " + key + " is: ");
				System.out.println(hmap.get(key));
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
