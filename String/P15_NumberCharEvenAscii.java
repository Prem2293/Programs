package String;

public class P15_NumberCharEvenAscii {
	public static void main(String[] args) {
		String a = "hello";
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			int b = a.charAt(i);
			if (b % 2 == 0) {
				count++;
			}
		}
		System.out.println("number of characters with even ascii value is :" + count);
	}
}
