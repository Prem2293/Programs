package String;

public class P24_MobileNumber {
	public static void main(String[] args) {
		String a="9876543210";
		
		for (int i = 0; i < a.length(); i++) {
			if (i<=3) {
				System.out.print(a.charAt(i));
			} else {
				System.out.print("*");
			}
		}
	}

}
