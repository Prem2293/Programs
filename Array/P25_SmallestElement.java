package Array;

public class P25_SmallestElement {
	public static void main(String[] args) {
		int[] a = { 88, 2, 68, 53 };
		int small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];
			}
		}
		System.out.println(small);
	}

}
