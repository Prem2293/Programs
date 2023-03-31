package looping_statement;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number (start range)");
		int a = s.nextInt();
		System.out.println("enter a number (end range)");
		int b = s.nextInt();
		s.close();
		int count=0;
		int sum=0;
		for (int i = a; i <= b; i++) {
			count++;
			sum +=i;
		}
		System.out.println(sum/count);
	}

}
