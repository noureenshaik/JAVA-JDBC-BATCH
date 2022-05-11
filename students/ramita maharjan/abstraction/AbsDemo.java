package abstraction;

abstract class Animal{
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Animal sleeping");
	}
}

class Dog extends Animal{

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Dog making sound");
	}
	
}

public class AbsDemo {
	public static void main(String args[]) {
		Animal dog = new Dog();
		dog.animalSound();
		dog.sleep();
	}
}
