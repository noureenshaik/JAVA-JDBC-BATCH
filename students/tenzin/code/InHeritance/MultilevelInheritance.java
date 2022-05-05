  class Mammal{
	void eat() {
		System.out.println("eatingggg");
	}
}
class Dog extends Mammal{
	void bark() {
		System.out.println("Barkingg");
	}
}
class BabyDog extends Dog{
	void weeping() {
		System.out.println("Weeping ");
	}
}
public class MultilevelInheritance {
	public static void main(String [] args) {
		BabyDog bg=new BabyDog();
		bg.bark();
		bg.eat();
		bg.weeping();
	}
}
