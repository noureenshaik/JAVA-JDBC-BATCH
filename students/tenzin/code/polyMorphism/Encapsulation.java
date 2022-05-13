class Student{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}


public class Encapsulation {

	public static void main(String [] args) {
		Student s=new Student();
		s.setName("tenzin");
		System.out.println("The Student Name Is "+s.getName());
	}
}
