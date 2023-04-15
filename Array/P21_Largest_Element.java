package Array;

public class P21_Largest_Element {
	public static void main(String[] args) {
		int[] arr = { 85, 8, 9, 5, 2 };
		int larger = 0;
		for (int i = 0; i < arr.length; i++) {
//			for (int j = 1; j < arr.length; j++) {
				if (arr[i] > larger) {
					larger = arr[i];
				}
//			}
		}
		System.out.println("Lagrest elemet is " + larger);

	}

}