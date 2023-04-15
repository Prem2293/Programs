package Array_2D;

public class P7_Check {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3,4 }, { 0, 2, 3,4}, {1, 2, 3,4} };
		int[][] b = { { 1, 2, 3,4 }, { 2, 2, 3,4}, {1, 2, 3,4 } };
		for (int[] is : a) {
			for (int is2 : is) {
				int count=0;
				int value=is2;
				for (int[] is3 : b) {
					for (int is4 : is3) {
						int val=is4;
						if (value==val) {
							count++;
						}
						
					}
				}
				if (count>0) {
					System.out.println(value+" is present "+count+"times ");
				}else {
					System.out.println(value+" is not present ");
				}
			}
			
		}
	}

}
