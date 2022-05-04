package com.employee.inheri;

class Animal2 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog2 extends Animal2 {
	void bark() {
		System.out.println("barking...");
	}
}

class Cat extends Animal2 {
	void meow() {
		System.out.println("meowing...");
	}
}

public class HierarchicalInnheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.meow();
		c.eat();
		// c.bark();//C.T.Error

	}

}