package Methods_recursion;

public class Welcome {
	
	public static void print(int a) {
		System.out.println("WELCOME");
	  if (a==10) {
		return;
	}	
	  a++;
		print(a);
	}
	public static void main(String[] args) {
		print(1);
	}

}
