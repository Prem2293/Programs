package Methods_recursion;

import java.util.Scanner;

public class Count_Numbers {
	static int i =0;
	static int count = 0;
	

	public static void count(int a) {
		if (i < a) {
			count++;
		}
		if (i == a) {
			System.out.println(count + " numbers present");
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
