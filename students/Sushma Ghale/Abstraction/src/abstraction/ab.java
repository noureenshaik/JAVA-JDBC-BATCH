package abstraction;
//Abstract class
abstract class Animal {
//Abstract method (does not have a body)
	public abstract void animalSound();
// Regular method
	public void sleep() {
		System.out.println("xyz xyz");
	}
}

//subclass (Inherit from Animal)
class Dog extends Animal {
	public void animalSound(){
		//The body of animalSound ()is provided here
	System.out.println ("The Dog says : wee wee");
}
}
class ab {
public static void main (String []args) {
	Dog myDog = new Dog (); //Create a Pig object
	myDog.animalSound();
	myDog.sleep();
}
}