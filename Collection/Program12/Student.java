package Program12;

public class Student implements Comparable<Student> {
	int age;
	String name;
	int id;

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", id=" + id + "]";
	}

	public Student(int age, String name, int id) {
		this.age = age;
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Student o) {
		if (this.age == o.age) {
			return 0;
		} else if (this.age < o.age) {
			return -1;
		} else {
			return 1;
		}
	}

}
