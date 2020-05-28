package com.yedam.generic;
// <T>
// <?>, <? extends class>, <? super class>
// person -> Worker
//		  -> Student -> HighStudent
// Course<T>
public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		// Course<Person>, Course<Worker>, Course<Student>, Course<HighStduent>
		System.out.println(course.getName() + " ������: " 
		+ Arrays.toString(course.getStudents());
		
		// [1,2,3] => [1,2,3]
	}	
		public static void registerStudent(Course<? extends Student> course); }
			System.out.println(couse.getName( + "������:"
					+ Arrays.toString(course.getStudents());
public static void main(String[] args) {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<Person>("�Ϲ��ΰ���", 5);
		coursePerson.add(new Person("�Ϲ���"));
		coursePerson.add(new Worker("������"));
		coursePerson.add(new Student("�л�"));
		coursePerson.add(new HighStudent("����л�"));
		
		Course<Worker> courseWorker = new Course<Worker>("�����ΰ���", 5);
		courseWorker.add(new Person("������"));
				
		Course<Student> courseStudent = new Course<Student>("�л�����", 5);
		courseStudent.add(new Student("�л�"));
		courseStudent.add(new HighStudent("����л�"));
		
		Course<HighStudent> courseHigh = new Course<HighStudent>("����л�");
		courseHigh.add(new HighStudent("����л�"));
		
		// Course<?>
		registerCourse(coursePerson);
		registerCourse(courseWorker);
		registerCourse(courseStudent);
		registerCourse(courseHigh);
		
		// Course<? extends class>
		registerStudent(coursePerson);
		registerStudent(courseHigh);
		
		// Course<? super class>
		registerWorker(coursePerson);
		regusterWorker(courseWorker);
//		registerWorker(courseStudent);
		
	
	}
	
}
