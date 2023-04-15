package Array;

public class P31_SortArrayWithoutThird {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 8, 1, 0 };

		int n = arr.length;
		boolean swapped;

		do {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					arr[i] = arr[i] + arr[i + 1];
					arr[i + 1] = arr[i] - arr[i + 1];
					arr[i] = arr[i] - arr[i + 1];
					swapped = true;
				}
			}
			n--;
		} while (swapped);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}
