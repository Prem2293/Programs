package Array;

public class P3_BinarySearch {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int value = 25;
		int first = 0;
		int last = a.length - 1;
		int mid = ((first + last) / 2);
		while (first < last) {
			if (a[mid] == value) {
				System.out.println("element found at " + mid + " position");
				break;
			} else if (mid < value) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = ((first + last) / 2);
		}
		if (first>last) {
			System.out.println("not found");
		}

	}

}
