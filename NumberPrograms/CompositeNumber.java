package looping_statement;

import java.util.Scanner;

public class CompositeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();
		s.close();
		int count = 0;
		for (int i = 2; i < a ; i++) {
			if (a % i == 0) {
				count++;
			} 
		}
		if (count>0) {
			System.out.println("composite number");
		}else {
			System.out.println("not composite number");
		}
	}
}
