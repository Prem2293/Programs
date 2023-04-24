package Program4;

import java.util.ArrayList;
import java.util.Iterator;

public class Program4 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("vanilla");
		a.add("mango");
		a.add("strawberry");
		a.add("blueberry");
		a.add("rose");
		Iterator d=a.iterator();
		while(d.hasNext()) {
			System.out.println(d.next());
		}
	}

}
