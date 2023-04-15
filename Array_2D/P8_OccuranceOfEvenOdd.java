package Array_2D;

public class P8_OccuranceOfEvenOdd {
	public static void main(String[] args) {
		int[][] a = { { 4, 5, 6 }, { 8, 9, 8 }, { 8, 5, 2 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]%2==0) {
					System.out.println(a[i][j]+" found even at: row="+i+" col:"+j);
				}else {
					System.out.println(a[i][j]+" found odd at: row="+i+" col:"+j);
				}
			}
		}
	}
}
