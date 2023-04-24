package Program10;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
	public static void main(String[] args) {
		ArrayList<Menu> a = new ArrayList<Menu>();
		a.add(new Menu("glass", 399));
		a.add(new Menu("back cover", 349));
		a.add(new Menu("earphones", 389));
		a.add(new Menu("Skin cover", 799));
		Collections.sort(a);

		for (Object object : a) {
			System.out.println(object);

		}
	}
}
