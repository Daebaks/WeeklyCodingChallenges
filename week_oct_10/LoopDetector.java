package week_oct_10;

import java.util.LinkedList;

public class LoopDetector {

	/**
	 * Method to check whether a LinkedList is circular and returns the node and it's value if true
	 * @param a -> The LinkedList to test
	 * @return a string contains the node+value, or no circulation detected
	 */
	public static String detect(LinkedList a) {
		
		String result = "Not a circular LinkedList!";
		LinkedList<Object> tmp = new LinkedList<Object>();
		for (int i=0; i<a.size(); i++) {
			if (tmp.contains(a.get(i))) {
				result = "Circular LinkedList detected, node is: ("+i+") and the value is: "+a.get(i);
				break;
			} else {
				tmp.add(a.get(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {

		LinkedList a = new LinkedList<>();
		LinkedList b = new LinkedList<>();

		// Circular example
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add("E");
		a.add("C");

		System.out.println(detect(a));

		// None circular example
		b.add("A");
		b.add("B");
		b.add("C");
		b.add("D");
		b.add("E");
		b.add("F");

		System.out.println(detect(b));

	}

}

//Console output:
//===============

//Circular LinkedList detected, node is: (5) and the value is: C
//Not a circular LinkedList!

