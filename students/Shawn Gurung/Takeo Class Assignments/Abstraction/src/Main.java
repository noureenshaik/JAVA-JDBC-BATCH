// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("xyx xyx");
  }
}

// Subclass (inherit from Animal)
class Dog extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The Dog says: bow bow");
  }
}

class Main {
  public static void main(String[] args) {
    Dog myDog = new Dog(); // Create a dog object
    myDog.animalSound();
    myDog.sleep();
  }
}