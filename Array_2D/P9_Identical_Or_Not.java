package Array_2D;

public class P9_Identical_Or_Not {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int[][] b = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		boolean flag = false;
		li: for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a.length == b.length && a[i].length == b[i].length) {
					if (a[i][j] == b[i][j]) {
						flag = true;
					} else {
						break li;
					}
				} else {
					break li;
				}
			}
		}
		if (flag) {
			System.out.println("they are same");
		} else {
			System.out.println("they are not same");
		}
	}
}
