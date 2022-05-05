class Animals{
	void eat() {
		System.out.println("i am eating");
	}
}
class Bark extends Animals{
	void bark() {
		System.out.println("I am Barking");
	}
}
public class SingleInheritance {
	public static void main(String [] argsq) {

	Bark b =new Bark();
	b.bark();
	b.eat();
	
}}
