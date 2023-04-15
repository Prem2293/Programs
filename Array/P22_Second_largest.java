package Array;

public class P22_Second_largest {
	public static void main(String[] args) {
		int[] arr = { 96, 25, 68, 53, 1 };
		int second = 0;
		int larger = 0;
		for (int i = 0; i < arr.length; i++) {

//			for (int j = 0; i < arr.length - j - 1; j++) {
				if (arr[i] > larger) {
					second = larger;
					larger = arr[i];
				} else if (arr[i] > second && arr[i] != larger) {
					second=arr[i];
				}
//			}
		}

		System.out.println("second lagest elemet is " + second);
		System.out.println("first lagest elemet is " + larger);

	}
}
