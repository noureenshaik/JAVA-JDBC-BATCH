package usedinterfacejava;
import java.util.*;

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
	
	}


public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating user-defined class objects
		Student s1=new Student(101,"Sonoo", 23);
		Student s2=new Student(102,"Sonoo", 21);
		Student s3=new Student(103,"Sonoo", 25);
		
		//creating arraylist
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1); //adding student class object
		al.add(s2);
		al.add(s3);
		 
		
	///getting Iterator
		Iterator itr=al.iterator();
		//traversing elements of ArrayList object
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+ "" +st.name+ "" +st.age);
		}

	}

}
