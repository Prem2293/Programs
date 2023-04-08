package Methods_recursion;

import java.util.Scanner;

public class Even_odd {
	static int a=1;
	public static void test(int z) {
		if (a==z) {
			return;
		}
		if (a%2==0) {
			System.out.println("even number "+a);
		} 
		a++;
		test(z);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start range");
		int start=s.nextInt();
		a=start;
		System.out.println("enter the start range");
		int end =s.nextInt();
		s.close();
		test(end);
		
	}
	

}
