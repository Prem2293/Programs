package looping_statement;

import java.util.Scanner;

public class TechNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();
		s.close();
		int temp = a;
		int rev = 0;
		int count = 0;
		while (temp != 0) {
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			count++;
			temp = temp / 10;
		}
		int num1 = 0;
		int num2 = 0;
		int temp1 = rev;
		if (count % 2 == 0) {

			for (int i = 1; i <= count; i++) {
				if (i <= count/2) {
					num1 = (temp1 % 10) + (num1 * 10);
				}else {
					num2 = (temp1 % 10) + (num2 * 10);
				}
				temp1 = temp1 / 10;
			}
			int add = num1 + num2;
			int square = add * add;
			if (square == a) {
				System.out.println("Number Is Tech Number");
			} else {
				System.out.println("Number Is Not Tech Number");
			}
		}else {
			System.out.println("Not Tech Number");
		}
		

	}

}
