package Program9;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
	public static void main(String[] args) {
		ArrayList<Pizza> a=new ArrayList<Pizza>();
		a.add(new Pizza(7, 399));
		a.add(new Pizza(8, 349));
		a.add(new Pizza(9, 389));
		a.add(new Pizza(10, 799));
		Collections.sort(a);
		
		for (Object object : a) {
			System.out.println(object);

		}
	}

}
