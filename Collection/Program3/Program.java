package Program3;

import java.util.HashSet;

public class Program {
	public static void main(String[] args) {
		HashSet a = new HashSet();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		int product = 1;
		for (Object object : a) {
			product*=(int)object;
		}
		System.out.println("product of all objects is "+product);
	}

}
