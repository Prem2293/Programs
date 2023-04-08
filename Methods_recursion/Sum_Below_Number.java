package Methods_recursion;

import java.util.Scanner;

public class Sum_Below_Number {
	static int i =0;
	static int sum=0;
	

	public static void count(int a) {
		if (i < a) {
			sum+=i;
		}
		if (i == a) {
			System.out.println(sum + " is numbers sum");
			return;
		}
		i++;
		count(a);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter start range");
		i = s.nextInt();
		System.out.println("enter end range");
		int end = s.nextInt();
		s.close();
		count(end);

	}

}
