package String;

import java.util.Arrays;

public class P1_Anagram {
	public static void main(String[] args) {
		String a = "heart";
		String b = "earth";
		
		if (a.length()==b.length()) {
			boolean flag=false;
			char[] a1=a.toCharArray();
			char[] b1=b.toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			for (int i = 0; i < a1.length; i++) {
				if (a1[i]==b1[i]) {
					flag=true;
				} else {
					flag=false;
					break;
				}
			}
			if (flag) {
				System.out.println("it is Anagram");

			}else {
				System.out.println("not Anagram");

			}
		} else {
			System.out.println("not Anagram");
		}
		
	}

}
