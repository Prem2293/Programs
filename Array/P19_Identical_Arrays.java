package Array;

public class P19_Identical_Arrays {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr1 = { 1, 2, 3, 4 };
		if (arr.length == arr1.length) {
			boolean flag = false;
			for (int i = 0; i < arr1.length; i++) {
				if (arr[i] == arr1[i]) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("they are identical");
			} else {
				System.out.println("they are not identical");
			}
		} else {
			System.out.println("they are not identical");

		}
	}
}
