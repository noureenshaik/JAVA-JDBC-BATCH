package inheritance;

public class Programmer extends Employee {
	int bonus;

	public Programmer(float salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public static void main(String args[]) {
		Programmer p = new Programmer(40000, 1000);
		System.out.println("Salary of programmer: "+ p.getSalary());
		System.out.println("Bonus of programmer: " + p.getBonus());
	}
}
