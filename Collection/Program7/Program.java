package Program7;

import java.util.ArrayList;

public class Program {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("banglore");
		a.add("pune");
	    a.add("mumbai");
	    a.add("delhi");
	    a.add("aurangabad");
	    
		
		for (Object object : a) {
			System.out.println(object);
		}
	    
		
	}

}
