package String;

public class P9_ConvertCharArrayUpperCase {
	public static void main(String[] args) {
		String a = "string";
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				int f = a.charAt(i) - 32;
				char g = (char) f;
				b += g;
			}
		}
		System.out.println(b);
	}
}
