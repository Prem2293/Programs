package Array;

public class P40_SelectionSort {
	public static void main(String[] args) {
		int[] a = { 6, 5, 2, 8, 1, 3, 5 };

		for (int i = 0; i < a.length-1; i++) {
			int s = i;
			for (int j = i; j < a.length; j++) {
				if (a[s] > a[j]) {
					s = j;
				}
			}
			int temp = a[s];
			a[s] = a[i];
			a[i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
