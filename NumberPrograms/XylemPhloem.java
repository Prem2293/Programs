package looping_statement;

import java.util.Scanner;

public class XylemPhloem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();
		s.close();
		int mid = 0;
		int last = a % 10;
		for (int i = a / 10; i > 0; i = i / 10) {

			if (i < 10) {
				last += i % 10;
			} else {
				mid += i % 10;
			}
		}
		if (mid == last) {
			System.out.println("Xylem Number");

		} else {
			System.out.println("Not Xylem Number");

		}
	}
}
