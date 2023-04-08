package Methods_recursion;

public class SumOfNumbers {
	public static int add(int a) {
		if (a==1) {
			return 0;
		}else {
			return (a-1)+add(a-1);
		}
	}
	public static void main(String[] args) {
		System.out.println(add(5));
	}

}
