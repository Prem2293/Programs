package Array;

import java.util.Scanner;

public class P37_RemoveArrayElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = { 1, 2, 3, 4 };
		int b[] = new int[a.length - 1];
		System.out.println("enter number you want to remove");
		int remove = s.nextInt();
		s.close();
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != remove) {
				b[j++] = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
