package String;

public class P12_PrindDuplicateChar {
	public static void main(String[] args) {
		String a = "heeeeee  elll  loooooooollll";
		char[] string = a.toCharArray();
		for (int i = 0; i < string.length; i++) {
			int count = 1;
			for (int j = i+1; j < string.length; j++) {
				if (a.charAt(i) == a.charAt(j) && i != j && a.charAt(i) != ' ') {
					string[j] = '[';
					count++;
				}
			}
			if (count > 1 && string[i] != '[') {
				System.out.println(a.charAt(i) + " is duplicate character in string");
			} else {
//				System.out.println(a.charAt(i)+" is unique");
			}
		}
	}
//	public static void main(String[] args) {
//		String a = "hello";
//		int b=0;
//		for (int i = 0; i < a.length(); i++) {
//			for (int j = 0; j < a.length(); j++) {
//				if (a.charAt(i)==a.charAt(j) && i!=j && a.charAt(i)!='(') {
//					char p=a.charAt(i);
//					a=a.replace(a.charAt(i), '(');
//					System.out.println(" occurance at "+p+" index "+b+++" time ");
//				}
//			} 
//		}
//	}
}
