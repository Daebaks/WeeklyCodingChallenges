package week_oct_10;

import java.util.LinkedList;

public class IntersectionNode {

	/**
	 * Method to test for intersection node, assuming there is only 1 or none
	 * @param a -> First LinkedList arg
	 * @param b -> Second LinkedList arg
	 * @return A string contains the node (point), or no intersection was found
	 */
	public static String checkIntersection(LinkedList a, LinkedList b) {

		String result = "No intersection found!";

		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < b.size(); j++) {
				if (a.get(i) == b.get(j)) {
					result = "Intersection point is: (" + i + "," + j + ") and the value is: " + a.get(i);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {

		LinkedList a = new LinkedList<>();
		LinkedList b = new LinkedList<>();

		// There is one point of intersection example
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		b.add(4);

		System.out.println(checkIntersection(a, b));

		// There is no intersection example
		a.clear();
		b.clear();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		b.add(5);
		b.add(6);
		b.add(7);

		System.out.println(checkIntersection(a, b));

	}

}

//Console output:
//===============

//Intersection point is: (3,4) and the value is: 4
//No intersection found!
