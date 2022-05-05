


public class SimpleInheritance extends Employee{
	public static void main(String [] args) {
		int bonus=234;
		
		
		SimpleInheritance sh=new SimpleInheritance();
		System.out.println("Salary "+sh.salary);
		System.out.println("Bonus "+bonus);
		
		
	}

}
class Employee{
	public float salary=20000;
}
