package Program6;

import java.util.LinkedList;

public class Program {
	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add("The Secret");
		a.add("To Kill a Mockingbird");
	    a.add("Pride and Prejudice");
	    a.add("The Great Gatsby");
	    a.add("The Catcher in the Rye");
	    
		LinkedList b=new LinkedList();
		for (Object object : a) {
			b.add(object);
		}
		for (Object object : b) {
			System.out.println(object);
		}
	    
		
	}

}
