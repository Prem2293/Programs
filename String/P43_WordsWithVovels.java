package String;

public class P43_WordsWithVovels {
	public static void main(String[] args) {
		String a = " I am the umbrella ";
		String b = "";
		int count=0;
		for (int i = 0; i < a.length(); i++) {
			b += a.charAt(i);
			if (a.charAt(i) == ' ') {
				if (b.charAt(0) == 'a' || b.charAt(0) == 'e' || b.charAt(0) == 'i' || b.charAt(0) == 'o'
						|| b.charAt(0) == 'u' || b.charAt(0) == 'A' || b.charAt(0) == 'E' || b.charAt(0) == 'I'
						|| b.charAt(0) == 'O' || b.charAt(0) == 'U') {
//					System.out.println(b);
					count++;
					b = "";
				} else {
					b = "";
				}
			}
		}
		System.out.println("number of words in string with starting vovels is :"+count);
	}
}
