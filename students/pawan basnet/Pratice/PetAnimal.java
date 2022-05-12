package Abstract;

abstract class Car {
    abstract void accelerate();
}

class Suzuki extends Car {
    void accelerate() {
        System.out.println("Suzuki :: accelerate");
    }
}

abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("xyz xyz");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Bark Bark");
    }
}

interface Animal2 {
	public void animalSound();

	public void sleep();
}

class Dog2 implements Animal2 {
	public void animalSound() {
		System.out.println("Bark Bark");
	}

	@Override
	public void sleep() {
		System.out.println("ZZZ ZZZ");
	}
}

class Main {
    public static void main(String[] args) {
        Car obj = new Suzuki();
        obj.accelerate();

        System.out.println("Using Abstract");
        Dog doggy = new Dog();
        doggy.animalSound();
        doggy.sleep();

        System.out.println("Using Interface");
        Dog2 doggy2 = new Dog2();
		doggy2.animalSound();
		doggy2.sleep();

        try {
			int data = 100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("Printing the rest");
		}
		

    }
}
