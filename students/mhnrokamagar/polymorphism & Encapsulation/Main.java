package com.polymorphism;

class Animal {
	public void animalSound() {
		System.out.println("The animal make a sound");
	}
}
 class Pig extends Animal {
	 public void animalSound() {
		 System.out.println("The pig says: wee wee");
	 }
 }
 class Dog extends Animal {
	 public void animalSound() {
		 System.out.println("The dog says: bow wow");
	 }
 }

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal myAnimal=new Animal();
		Animal myPig=new Pig();
		Animal myDog=new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();

	}

}
