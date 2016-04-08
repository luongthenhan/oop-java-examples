package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String args[]) {

		/* This is how to declare HashMap */
		Map<Integer, String> hmap = new HashMap<Integer, String>();

		/* Adding elements to HashMap */
		hmap.put(12, "Chaitanya");
		hmap.put(2, "Rahul");
		hmap.put(7, "Singh");
		hmap.put(49, "Ajeet");
		hmap.put(3, "Anuj");

		/* Display content using Iterator */
		// using the keySet function to get the set of keys
		Set<Integer> set = hmap.keySet();

		// using Iterator in order to cross the set
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.print("key is: " + key + " & Value is: ");
			System.out.println(hmap.get(key));
		}
		System.out.println();

		/* Get values based on key */
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);
		System.out.println();

		/* Remove values based on key */
		hmap.remove(3);

		System.out.println("Map key and values after removal:");
		// using the keySet function to get the set of keys
		Set<Integer> set2 = hmap.keySet();

		// using Iterator in order to cross the set
		Iterator<Integer> it2 = set2.iterator();
		while (it2.hasNext()) {
			Integer key = it2.next();
			System.out.print("key is: " + key + " & Value is: ");
			System.out.println(hmap.get(key));
		}

	}

}
