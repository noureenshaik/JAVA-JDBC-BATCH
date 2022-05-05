

class LAnimals{
	void eat() {
		System.out.println("eating ");
	}
}
class Puppy extends LAnimals{
	void bark() {
		System.out.println("Barkingg");
	}
}
class Cat extends LAnimals{
	void Meow() {
		System.out.println("Meowww");
	}
}

public class Hierarchical {
public static void main(String[] args) {
	Cat c=new Cat();
	c.eat();
	c.Meow();
}}
