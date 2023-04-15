package Array;

public class P27_ThirdSmallest {
	public static void main(String[] args) {
		int[] arr = { 0, 500, 12, 9, 25, 18, 59, 36, 8,-1 };
		int third_small = 0;
		int small = 0;
		int secondsmall = 0;// 2147483647
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > small) {
				small = arr[i];
				secondsmall = small;
				third_small = small;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				third_small = secondsmall;
				secondsmall = small;
				small = arr[i];
			} else if (arr[i] < secondsmall) {
				third_small = secondsmall;
				secondsmall = arr[i];
			} else if (arr[i] < third_small) {
				third_small = arr[i];
			}
		}
		System.out.println(third_small);
	}

}
