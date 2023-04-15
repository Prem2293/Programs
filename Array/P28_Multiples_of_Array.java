package Array;

public class P28_Multiples_of_Array {
	public static void main(String[] args) {
		int[] a = { 25, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					continue;
				}
				if (a[i] % a[j] == 0) {
					System.out.println("multiple of " + a[i] + " is " + a[j]);
					System.out.println("------------------------------");

				}
			}
		}
	}

}
