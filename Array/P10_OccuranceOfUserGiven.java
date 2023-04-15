package Array;

import java.util.Scanner;

public class P10_OccuranceOfUserGiven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number to check");
		int a = s.nextInt();
		int[] arr = new int[] { 1, 1, 5, 8, 3, 2 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] == a && arr[i] != -1) {
					arr[j] = -1;
					flag = true;
					count=j;
				}

			}
			if (flag) {
				System.out.println(arr[i] + " occured at " + count + " index");

			}
			s.close();

		}
	}
}
