package String;

public class P30_PositionOfChar {
	public static void main(String[] args) {
		String a="hello";
		char b='e';
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)==b) {
				System.out.println("position of "+b+" character is "+i+" index");
			}
			
		} 
	}

}
