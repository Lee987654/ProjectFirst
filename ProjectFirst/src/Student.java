
public class Student {
	// �ʵ�
	String name;
	int age;
	String major;

	// ������(�ʵ尪 �ʱ�ȭ)
	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, String major) {
		this(name, age);
		this.major = major;
	}

	// �޼ҵ�
	void setMajor(String major) {
		this.major = major;
	}

	String getMajor() {
		return major;

	}
}
