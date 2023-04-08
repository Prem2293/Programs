package Methods_recursion;

public class HappyBirthDay {
	public static void print(int a) {
		System.out.println("Happy Birthday");
	  if (a==5) {
		return;
	}	
	  a++;
		print(a);
	}
	public static void main(String[] args) {
		print(1);
	}

}
