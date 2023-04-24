package String;

public class P7_ConverCharinLower {
	public static void main(String[] args) {
		String a = "STRING";
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				int f = a.charAt(i) + 32;
				char g = (char) f;
				b += g;
			}
		}
		System.out.println(b);
	}
}
