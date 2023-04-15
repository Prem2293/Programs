package Array_2D;

public class P15_SparseMatrix {
	public static void main(String[] args) {
		int [][]a= {{1,1,1},{0,0,0},{1,1,1}};
		int count=0;
		int total=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				total++;
				if (a[i][j]==0) {
					count++;
				}
			}
		}
		if (count>(total/2)) {
			System.out.println("it is sparse");
		} else {
			System.out.println("it is not sparse");
		}
	}

}
