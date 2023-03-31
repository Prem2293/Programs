package looping_statement;

import java.util.Scanner;

public class AverageBetweenRange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the start range");
		int a = s.nextInt();
		System.out.println("enter the end range");
		int b = s.nextInt();
		s.close();
		int count=0;
		int sum=0;
		for (int i = a; i <= b; i++) {
			count++;
			sum+=i;
		}
		System.out.println("Average Is "+sum/count);
	}

}
