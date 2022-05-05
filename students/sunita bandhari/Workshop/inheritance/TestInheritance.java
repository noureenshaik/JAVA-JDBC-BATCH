package com.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();  
		d.bark();  
		d.eat();  
		System.out.println("********************");
		BabyDog d1 = new BabyDog();
		d1.weep();
		d1.bark();
		d1.eat();
		System.out.println("********************");
		Cat c=new Cat();  
		c.meow();  
		c.eat();  

	}

}
