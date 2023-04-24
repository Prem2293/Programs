package String;

public class P18_FirstHalfUpperRestLower {
	public static void main(String[] args) {
		String a="hello world";
		
		for (int i = 0; i < a.length(); i++) {
			if (i<=a.length()/2) {
				
				System.out.print(a.toUpperCase().charAt(i));
			}else {
				System.out.print(a.toLowerCase().charAt(i));
			}
		}
	}
}
