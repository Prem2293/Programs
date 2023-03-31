package Assessment;

import java.util.Scanner;

public class N_Powe_P {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int a=s.nextInt();
		System.out.println("enter power");
		int b=s.nextInt();
		s.close();
		int result=1;
		for (int i = 1; i <= b; i++) {
			result= result*a;
		}
		System.out.println("the N power P of number is "+result);
		
	}

}
