package Array;

public class P26_SecondSmallest {
	public static void main(String[] args) {
		int[] a = { 26, 500, 12, 90, 25, 18, 59, 36, 8 };
		int small = 0;
		int secondsmall = 0;// 2147483647
		for (int i = 0; i < a.length; i++) {
			if (a[i] > small) {
				small = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small) {
				secondsmall = small;
				small = a[i];
			} else if (a[i] < secondsmall) {
				secondsmall = a[i];
			}
		}
		System.out.println(secondsmall);
	}

}
