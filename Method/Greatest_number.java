package Method;

import java.util.Scanner;

public class Greatest_number {
	public static void bigger(int a,int b,int c) {
		System.out.println(a>b?a>c?"number 1 is bigger":"number 3 is bigger":b>c?"number 2 is bigger":"number 3 is bigger ");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number 1");
		int a=s.nextInt();
		System.out.println("enter number 2");
		int b=s.nextInt();
		System.out.println("enter number 3");
		int c=s.nextInt();
		s.close();
		bigger(a,b,c);
	}

}
