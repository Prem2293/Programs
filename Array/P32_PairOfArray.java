package Array;

public class P32_PairOfArray {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] + a[j] == 10) {
//					System.out.println("we found addition at index "+i+" and "+ j);
					System.out.println("we found addition at index " + a[i] + " and " + a[j]);

				}
			}
		}
	}

}
