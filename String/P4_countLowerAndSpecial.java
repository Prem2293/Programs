package String;

public class P4_countLowerAndSpecial {
	public static void main(String[] args) {
		String a = "St #ri $ng@";
		int charcount = 0;
		int speclcount = 0;
		for (int i = 0; i < a.length(); i++) {
			if ( a.charAt(i) >= 'a' && a.charAt(i) < 'z') {
				charcount++;
			} else if ((a.charAt(i) >= 'A' && a.charAt(i) < 'Z') || (a.charAt(i) >= '0' && a.charAt(i) < '9')) {

			} else {
				speclcount++;
			}
		}
		System.out.println("character count is " + charcount);
		System.out.println("special character count is " + speclcount);
	}
}
