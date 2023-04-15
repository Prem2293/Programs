package Array;

public class P4_BubbleSort {
	public static void main(String[] args) {
		int[] a = { 1, 20, 30, 50, 5, 6, 8, 2 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
//			int stop = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
//					stop = 1;
				}
			}
//			if (stop == 0) {
//				break;
//			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
