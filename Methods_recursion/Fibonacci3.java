package Methods_recursion;

import java.util.Scanner;

public class Fibonacci3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter start first number");
		first=s.nextInt();
		System.out.println("enter second number");
		second=s.nextInt();
		System.out.println("enter end range");
		int a=s.nextInt();
		fib(a);
		s.close();
	}
	static int first=0;
	static int second=0;
	static int third=0;
	static int i=0;
	
	public static void fib(int a) {
		if (i==a) {
			return;
		}
		third=first+second;
		first=second;
		second=third;
		System.out.println(third);
		i++;
		fib(a);
	}

}
