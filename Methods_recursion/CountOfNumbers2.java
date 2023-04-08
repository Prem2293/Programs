package Methods_recursion;

public class CountOfNumbers2 {
	static int count=0;
	public static int count(int a) {
		if (a==1) {
			count++;
			return 0;
		}else {
			count++;
			return count(a-1);
		}
	}
	public static void main(String[] args) {
		count(15);
		System.out.println(count);
	}

}
