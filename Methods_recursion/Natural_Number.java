package Methods_recursion;

public class Natural_Number {
	public static void num(int a) {
		if (a==11) {
			return;
		}
		System.out.println(a);
		a++;
		num(a);
	}

	public static void main(String[] args) {
		num(1);
	}

}
