package Array;

public class P7_Repeating_Elements {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 1, 5, 8, 3, 2, 2, 2 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && arr[i] != -1) {
					arr[j] = -1;
					count++;
					flag = true;
				}
			}
			if (flag) {
				System.out.println(arr[i] + " repeated element " + count + " times");

			}
		}
	}
}