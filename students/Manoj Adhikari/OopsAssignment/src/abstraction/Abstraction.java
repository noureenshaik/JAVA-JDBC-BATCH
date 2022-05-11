package abstraction;
//abstract class
abstract class Animal {
	// abstract method (does not have a body)
	public abstract void animalsound();
	// regular method
	public void sleep() {
		System.out.println("Zzzz");
	}
}
//subclass (inherit from animal)
class Dog extends Animal {
	// the body of animalSound(0 is provided here
	public void animalsound() {
		System.out.println("The dog says: voo voo");
	}


}
public class Abstraction {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.animalsound();
		dog.sleep();
	}
}
