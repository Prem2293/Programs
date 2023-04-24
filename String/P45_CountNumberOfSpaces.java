package String;

public class P45_CountNumberOfSpaces {
	public static void main(String[] args) {
		String a="hello this is test 	yantra";
		int count=0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("number of spaces in string is "+count);
	}
}
