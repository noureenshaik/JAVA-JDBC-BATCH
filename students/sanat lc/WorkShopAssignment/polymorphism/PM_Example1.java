package com.polymorphism;

 class Animal {

	public void animalSouds() {
		System.out.println("The animal makes sounds");
	}

}

class Pig extends Animal {
	public void animalSouds() {
		System.out.println("The Pig says: Wee Wee");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The Dog syas: Bow wow");
	}
}

class PM_Example1 {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalSouds();
		myPig.animalSouds();
		myDog.animalSouds();
	}
}
