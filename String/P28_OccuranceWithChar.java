package String;

public class P28_OccuranceWithChar {

	public static void main(String[] args) {
		String a = "care race";
		char v = 'a';
		int b = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == v) {
				b++;
			}
		}
		if (b > 0) {
			System.out.println("given character is present in String " + b + " times");
		} else {
			System.out.println("given character is not present in String");

		}
	}

}
