package com.example.demoProject.Polymorphism.Animal;

public class PolymorphismTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.name();
        dog.name();
        cat.name();
    }
}
