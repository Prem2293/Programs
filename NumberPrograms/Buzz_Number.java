package looping_statement;

import java.util.Scanner;

public class Buzz_Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int a = s.nextInt();
		s.close();

		
		if (a%10 == 7 || a % 7 == 0) {
			System.out.println("it is a buzz number");
		} else {
			System.out.println("it is not buzz number");
		}
	}

}
