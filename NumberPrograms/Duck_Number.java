package looping_statement;

import java.util.Scanner;

public class Duck_Number {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number");
		int a = s.nextInt();
		s.close();
		int count = 0;
		for (int i = a; i > 0; i = i / 10) {
			
			int dig = i % 10;
			System.out.println(dig);
			if (a > 0) {
				if (dig == 0) {
					count++;
				}
			}
		}
		if (count>0) {
			System.out.println("it is duck number");
		}else {
			System.out.println("it is not duck number");
		}
	}

}
