package String;

import java.util.Arrays;

public class P36_SeprateWords {
	public static void main(String[] args) {
		String a = "hello world this is test yantra ";
		String print = "";
		String[] store=new String[6];
		int index=0;
		for (int i = 0; i < a.length(); i++) {
			print += a.charAt(i);
			if (a.charAt(i) == ' ') {
				store[index++]=print;
				System.out.println(print);
				print = "";
			}
		}
		System.out.println(Arrays.toString(store));
	}

}
