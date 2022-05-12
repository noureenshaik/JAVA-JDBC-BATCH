class Animal{
	public void Sound() {
		System.out.println("All animals make sound");
	}
}
class Dog extends Animal{
	public void Sound() {
		System.out.println("Dog say Bow Bow !!!");
	}
}
class Cat extends Animal{
	public void Sound() {
		System.out.println("Cat says Meow Meow !!!");
	}
}


public class Example1 {


	
	public static void main(String [] args) {
		Animal a=new Animal();
		Animal d=new Dog();
		Animal c=new Cat();
		a.Sound();
		d.Sound();
		c.Sound();
	}
	
}
