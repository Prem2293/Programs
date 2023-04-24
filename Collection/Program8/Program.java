package Program8;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList pu1 = new ArrayList();
		pu1.add("Maths");
		pu1.add("Science");
		pu1.add("English");
		pu1.add("History");
		pu1.add("Geography");
		pu1.add("Computer");

		ArrayList pu2 = new ArrayList();
		pu2.add("Maths");
		pu2.add("Science");
		pu2.add("English");
		pu2.add("History");

		ArrayList pu3 = new ArrayList();
		for (Object object : pu1) {
			for (Object object2 : pu2) {
				if (object.equals(object2)) {
					pu3.add(object);
				}
			}
		}
		for (Object object : pu3) {
			System.out.println(object);
		}

	}

}
