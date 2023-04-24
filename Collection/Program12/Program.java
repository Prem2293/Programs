package Program12;

import java.util.ArrayList;
import java.util.Collections;

public class Program {
	public static void main(String[] args) {
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(new Student(18, "Rahul", 1));
		a.add(new Student(19, "Rohit", 2));
		a.add(new Student(22, "Ram", 3));
		a.add(new Student(16, "Ramesh", 4));
		a.add(new Student(10, "Rakul", 5));

		Collections.sort(a);
		for (Student student : a) {
			System.out.println(student);
		}
	}

}
