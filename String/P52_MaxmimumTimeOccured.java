package String;

public class P52_MaxmimumTimeOccured {
	public static void main(String[] args) {
		String a="hello";
		char max=' ';
		int count1=0;
		for (int i = 0; i < a.length(); i++) {
			int count=0;
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(i)==a.charAt(j)) {
					count++;
				}
			}
			if (count>count1) {
				max=a.charAt(i);
				count1=count;
			}
		}
		System.out.println("character "+max+" occured "+count1+" times");

	}

}
