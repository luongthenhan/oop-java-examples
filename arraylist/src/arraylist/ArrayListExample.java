package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String args[]) {
		// Creating an empty array list
		List<String> list = new ArrayList<String>();

		// Adding items to arrayList
		list.add("Item1");
		list.add("Item2");
		list.add(1, "Item3"); // it will add Item3 to the second position
		list.add("Item4");

		// Display the contents of the array list
		System.out.println("The arraylist contains " + "the following elements: " + list);

		// Checking index of an item
		int pos = list.indexOf("Item2");
		System.out.println("The index of Item2 is: " + pos);

		// Checking if array list is empty
		boolean check = list.isEmpty();
		System.out.println("Checking if the " + "arraylist is empty: " + check);

		// Getting the size of the list
		int size = list.size();
		System.out.println("The size of the list is: " + size);

		// Checking if an element is included to the list
		boolean element = list.contains("Item5");
		System.out.println("Checking if the arraylist " + "contains the object Item5: " + element);

		// Getting the element in a specific position
		String item = list.get(0);
		System.out.println("The item is the index 0 is: " + item);

		// Retrieve elements from the arraylist

		// 1st way: loop using index and size list
		System.out.println("Retrieving items with loop using index and size list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Index: " + i + " - Item: " + list.get(i));
		}

		// 2nd way: using foreach loop
		System.out.println("Retrieving items using foreach loop");
		for (String str : list) {
			System.out.println("Item is: " + str);
		}

		// 3rd way:using iterator
		// hasNext(): returns true if there are more elements
		// next(): returns the next element
		System.out.println("Retrieving items using iterator");
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			System.out.println("Item is: " + it.next());
		}

		// Replacing an element
		list.set(1, "NewItem");
		System.out.println("The arraylist after the replacement is: " + list);

		// Removing items
		// removing the item in index 0
		list.remove(0);

		// removing the first occurrence of item "Item2"
		list.remove("Item2");

		System.out.println("The final contents " + "of the arraylist are: " + list);

		// Removing an element in a loop
		list.add(1, "ToBeRemoved");
		System.out.println("The arraylist is: " + list);
		// use this way --> raise java.util.ConcurrentModificationException
		// for (String str : list) {
		// if (str.startsWith("ToBe")) {
		// list.remove(str);
		// }
		// }
		// you shoule use an Iterator
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			String str = it.next();
			if (str.startsWith("ToBe")) {
				it.remove();
			}
		}
		System.out.println("The arraylist is: " + list);

		// Converting ArrayList to Array
		String[] simpleArray = list.toArray(new String[list.size()]);
		System.out.println(
				"The array created after " + "the conversion of our arraylist is: " + Arrays.toString(simpleArray));
	}
}
