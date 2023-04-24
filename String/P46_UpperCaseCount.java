package String;

public class P46_UpperCaseCount {
	public static void main(String[] args) {
		String a="HeLLo WorlD";
		int count=0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)>='A' && a.charAt(i)<='Z') {
			count++;	
			}
		}
		System.out.println("number of uppercase characters are "+count);
	}

}
