package Array;

import java.util.Scanner;

public class P39_LinearSearch {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter value to search ");
		int a=s.nextInt();
		s.close();
		int[] arr= {1,2,5,8,69,2,5};
		int m=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==a) {
				System.out.println("value is present at "+i+" position");
				m++;
			}
		}
		if (m==0) {
			System.out.println("value is not persent in array");
		}
	}

}
