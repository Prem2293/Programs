package Method;

import java.util.Scanner;

public class Addition {
	public static void add(int a, int b) {
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number 1");
		int num1 = s.nextInt();
		System.out.println("enter number 2");
		int num2 = s.nextInt();
		add(num1, num2);
		s.close();
		
	}
}
