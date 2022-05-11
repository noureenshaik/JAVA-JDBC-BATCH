package abstraction;

interface Animal1{
	public abstract void animalSound();
	public void sleep();
}

class Dog1 implements Animal1{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog making sound");
	}

	@Override
	public void sleep() {
		System.out.println("Animal sleeping");
		
	}
}
public class AbsUsingInterface {
	public static void main(String args[]) {
		Dog1 dog = new Dog1();
		dog.animalSound();
		dog.sleep();
	}
	
}
