
interface animal1{
	public void eat();
	public void sleep();
}
class pig1 implements animal1{

	@Override
	public void eat() {
		System.out.println("eatingggg");
	}

	@Override
	public void sleep() {
		System.out.println("sleepinggg");
	}
	
}


public class Interfac {
public static void main(String [] args) {
	pig1 p=new pig1();
	p.eat();
	p.sleep();
}}
