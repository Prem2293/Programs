package Methods_recursion;

import java.util.Scanner;

public class Fibonacci_Series {
	static int a = 0;
	static int b = 1;
	static int c = 0;
	static int count = 1;
	
	public static void test(int end) {
		if (count==end+1) {
			return;
		}
		if (count==end) {
			System.out.println(c);
		}
//		System.out.println(c);
		c=a+b;
		a=b;
		b=c;
		count++;
		test(end);
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter end range");
		int end = s.nextInt();
		s.close();
		test(end);
	}

}
