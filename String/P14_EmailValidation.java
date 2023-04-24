package String;

public class P14_EmailValidation {
	public static void main(String[] args) {

		String a = "example@gmail.com";
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (!((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') && !(a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
					&& !(a.charAt(i) >= '0' && a.charAt(i) <= '9'))) {
				count++;
			}
		}

		if (count == 2) {
			if (a.endsWith("@gmail.com")||a.endsWith("@gmail.co")||a.endsWith("@gmail.in")||a.endsWith("@gmail.org")) {
					System.out.println("it is valid mail");
			} else {
				System.out.println("it is not valid mail");
			}
		} else {
			System.out.println("it is not valid mail");
		}
	}
}
