package com.inheritance;

public class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  

