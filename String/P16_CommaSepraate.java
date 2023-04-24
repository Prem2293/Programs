package String;

public class P16_CommaSepraate {
	public static void main(String[] args) {
		String a = "hello";
		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 0) {
				if (i == a.length() - 1) {
					System.out.print(a.charAt(i));
				} else {
					System.out.print(a.charAt(i) + ",");
				}
			}
		}
	}
}
