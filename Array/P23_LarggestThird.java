package Array;

public class P23_LarggestThird {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int firstLargest = 0;
		int secondLargest = 0;
		int thirdLargest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				thirdLargest = secondLargest;
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			} else if (arr[i] > thirdLargest) {
				thirdLargest = arr[i];
			}
		}
		System.out.println(thirdLargest);
	}
}
