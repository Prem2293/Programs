package Array;

import java.util.Scanner;

public class P9_Copy_Array {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter ARRAY sizes");
		int[] a=new int[s.nextInt()];
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter number");
			a[i]=s.nextInt();
		}
		int[] m=a;
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
		}
		s.close();
	}

}
