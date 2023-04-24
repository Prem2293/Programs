package String;

public class P10_CountVovles_Number_SpecialChar {
	public static void main(String[] args) {
		String a = "1Ae2ioU5@gg5g";
		int consonant = 0;
		int vovel = 0;
		int spcl = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I'
					|| a.charAt(i) == 'O' || a.charAt(i) == 'U') {
				vovel++;
			} else if ((a.charAt(i) >= 'a') && a.charAt(i) <= 'z' || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				consonant++;
			} else if (!(a.charAt(i) >= '0' && a.charAt(i) <= '9')) {
				spcl++;
			}
		}
		System.out.println("Consonant : "+consonant);
		System.out.println("vovel : "+vovel);
		System.out.println("special chararcter : "+spcl);
	}
}
