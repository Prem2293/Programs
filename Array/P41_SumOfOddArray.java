package Array;

public class P41_SumOfOddArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				sum += a[i];
//				System.out.println(a[i]);
			}
		}
		System.out.println(sum);
	}

}
