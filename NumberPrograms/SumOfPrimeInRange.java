package looping_statement;

import java.util.Scanner;

public class SumOfPrimeInRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the start of range");
		int a = s.nextInt();
		System.out.println("enter the end of range");
		int b = s.nextInt();
		s.close();

		int sum=0;
		for (int i = a; i <=b; i++) {
			int count = 0;
			for (int j = 1; j <=b; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==2) {
				sum +=i;
			}
		}
		System.out.println("sum is "+sum);
		

	}
}
