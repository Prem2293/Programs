package Method;

import java.util.Scanner;

public class StudentGrade {
	public static void grade(double a, double b,double c,double d,double e) {
		double percent=(((a+b+c+d+e)/500)*100);
		if (percent>85&& percent<=100) {
			System.out.println("grade A+");
		}else if (percent>70 && percent<=85) {
			System.out.println("grade A"); 
		}else if (percent>50 && percent<=70) {
			System.out.println("grade B"); 
		}else if (percent>35 && percent<=50) {
			System.out.println("grade C"); 
		}else {
			System.out.println("failed");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks of maths");
		double a=s.nextDouble();
		System.out.println("enter marks of english");
		double b=s.nextDouble();
		System.out.println("enter marks of science");
		double c=s.nextDouble();
		System.out.println("enter marks of history");
		double d=s.nextDouble();
		System.out.println("enter marks of computer science");
		double e=s.nextDouble();
		s.close();
		grade(a, b, c, d, e);
	}

}
