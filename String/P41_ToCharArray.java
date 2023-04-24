package String;

import java.util.Arrays;

public class P41_ToCharArray {
	public static void main(String[] args) {
		String a="hello";
		char[] b=a.toCharArray();
		System.out.println(Arrays.toString(b));
//		char[] d=new char[a.length()];
//		for (int i = 0; i < d.length; i++) {
//			d[i]=a.charAt(i);
//		}
//		System.out.println(Arrays.toString(d));
	}
}
