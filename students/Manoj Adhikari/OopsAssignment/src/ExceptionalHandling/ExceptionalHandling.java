package ExceptionalHandling;

public class ExceptionalHandling {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Throwing Error: " + e);
        }
    }
}
