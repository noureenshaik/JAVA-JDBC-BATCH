package abstraction;

interface Animall {
    public void animalsound();

    public void sleep();
}

class Pig implements Animall {
    public void animalsound() {
        System.out.println("The dog says: voo voo");
    }

    public void sleep() {
        System.out.println("zz");
    }
}

public class Interface {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalsound();
        pig.sleep();
    }
}
