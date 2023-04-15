package Array;

public class P18_PrintHigestElementSum {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 130, 40, 50, 280 };
		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + arr[i + 1] > sum) {
				sum = arr[i] + arr[i + 1];
			}
		}
		System.out.println(sum);
	}

}
