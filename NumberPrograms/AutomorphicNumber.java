package looping_statement;

import java.util.Scanner;

public class AutomorphicNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();//accept the number
		int temp=a;
		int count=0;//counting digits in number
		
		
		//count logic start
		while(temp!=0) {
			count++;
			temp=temp/10;
		}//count logic end
		int num=a*a;//squaring for fetching last digits
		int rev=0;// for reversing
		int rem=0;//for storing a digit
		
		//reversing the last 2 digits of square (num)
		for (int i = 1; i <= count; i++) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;			
		}
		
		//reversing reversed number fetched from square
		int rev2=0;
		while (rev!=0) {
			rem=rev%10;
			rev2=rev2*10+rem;
			rev=rev/10;
		}
		
		//comparing numbers 
		if (rev2==a) {
			System.out.println("it is automorphis number");
		}else {
			System.out.println("it is not automorphis number");
		}	
		s.close();
	}
}
