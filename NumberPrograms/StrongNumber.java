package Assessment;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();
		s.close();
		int sum = 0;
		for (int i = a; i > 0; i = i / 10) {
			int digit = i % 10;

			int fact = 1;
			for (int j = 1; j <= digit; j++) {
				fact *= j;
			}
			sum += fact;
		}
		System.out.println(a);
		System.out.println(sum);

		if (sum == a) {
			System.out.println("the given number is a strong number");
		} else {
			System.out.println("the given number is not a strong number");
		}

	}

}
