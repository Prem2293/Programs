package Array_2D;

//import java.util.Scanner;

public class P10_Identity_Matrix {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter size of row");
//		int size = s.nextInt();
//		
//		int[][] a = new int[size][size];
//		int[][] b = new int[size][size];
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				if (i == j) {
//					System.out.println("enter number");
//
//					int m = s.nextInt();
//					a[i][j] = m/m;
//					b[i][j] = m/m;
//				}
//			}
//		}
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] );
//			}
//			System.out.println();
//		}
//		s.close();
//	}
	public static void main(String[] args) {
		int[][] a= {{1,0,0},{0,1,0},{0,0,1}};
		boolean flag=true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][j]==1 && i==j) {
					
				}else if (a[i][j]==0 && i!=j) {
					
				}else {
					flag=false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("it is identity");
		} else {
			System.out.println("it is not identity");
		}
	}
}
