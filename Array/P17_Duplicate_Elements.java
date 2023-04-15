package Array;

public class P17_Duplicate_Elements {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 1, 2, 5, 3 };

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && arr[i] != -1) {
					arr[j] = -1;
					flag = true;
				}
			}
			if (flag) {
				System.out.println(arr[i] + " is duplicate element ");

			}
		}
	}
}
