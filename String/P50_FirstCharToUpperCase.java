package String;

import java.util.Scanner;

public class P50_FirstCharToUpperCase {
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		System.out.println("enter a sentence");
		String a = f.nextLine();
		f.close();
		String b = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ' ') {
				b += a.charAt(i);
			} else if (i == 0 || a.charAt(i-1)==' ' && (a.charAt(i)>='a' && a.charAt(i)<='z')) {
				b += (char) (a.charAt(i) - 32);
			} else {
				b += (char) (a.charAt(i));
			}
		}
		System.out.println(b);
	}

}
