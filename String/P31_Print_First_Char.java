package String;

public class P31_Print_First_Char {
	public static void main(String[] args) {
//		String r="red";
//		String o="orange";
//		String y="yellow";
//		String g="green";
//		String b="blue";
//		String i="indigo";
//		String v="voliet";
//		System.out.println(r.charAt(0));
//		System.out.println(o.charAt(0));
//		System.out.println(y.charAt(0));
//		System.out.println(g.charAt(0));
//		System.out.println(b.charAt(0));
//		System.out.println(i.charAt(0));
//		System.out.println(v.charAt(0));
		String a=" red orange yellow green blue indigo voliet";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i)!=' ' && a.charAt(i-1)==' ') {
				System.out.print(a.charAt(i));
			}
		}

	}

}
