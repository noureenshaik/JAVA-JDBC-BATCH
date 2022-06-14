package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	int rollno;
	String name;
	int age;
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		
		List <Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Student stu = (Student)it.next();
			System.out.println(stu.rollno+" "+stu.name+" "+stu.age);
		}
		System.out.println("*****************");
		for(Student stu1:list) {
			System.out.println(stu1.getRollno()+" "+stu1.getName()+" "+stu1.getAge());
		}
		
	}

}
