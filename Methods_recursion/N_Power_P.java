package Methods_recursion;

import java.util.Scanner;
//base condition= it is the condition given to stop the recursion
//we should stop the recursion when we find solution or our base condition 
//we need to stop recursion to avoid infinite loop 

public class N_Power_P {
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int a = s.nextInt();
		System.out.println("enter power");
		int b = s.nextInt();
		s.close();
		System.out.println(pow(a,b));

	}
	public static int pow(int a,int b) {
		if (b==1) {
			return 0;
		}else {
			return a*a+pow(a, --b);
		}

	}


}
