package Array;

import java.util.Scanner;

public class P5_CharArray_FirstLast {
	public static void main(String[] args) {
		char[] a = new char[5];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter character");
			a[i] = s.next().charAt(0);
		}
		System.out.println("first " + a[0] + "  last " + a[a.length - 1]);
		s.close();

	}

}
