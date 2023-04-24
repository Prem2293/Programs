package String;

public class P25_OddCaseEvenCase {
	public static void main(String[] args) {
		String a = "hello world";

		for (int i = 0; i < a.length(); i++) {
			if (i % 2 == 0) {
				System.out.print(a.toUpperCase().charAt(i));
			} else {
				System.out.print(a.toLowerCase().charAt(i));
			}
		}
	}

}
