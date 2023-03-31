package looping_statement;

import java.util.Scanner;

public class PrimeInRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the start of range");
		int a = s.nextInt();
		System.out.println("enter the end of range");
		int b = s.nextInt();
		s.close();
		
		for (int i = a; i <=b; i++) {
			if (check(i)==1) {
				System.out.println("it is prime " +i);
			}
//			else {
//				System.out.println("it is not prime");
//			}
		}

	}
	public static int check(int a) {
		int count=1;
		for (int i = 2; i <=a/2; i++) {
			if (a%i==0) {
				count++;
			}
		}
		return count;
	}
}
