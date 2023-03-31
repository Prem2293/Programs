package looping_statement;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = 1 + s.nextInt();
		s.close();
		boolean flag=false;
		for (int i = 1; i < a / 2; i++) {
			if (i*i==a) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println("it is an sunny number");
		} else {
			System.out.println("it is not an sunny number");
		}

	}

}
