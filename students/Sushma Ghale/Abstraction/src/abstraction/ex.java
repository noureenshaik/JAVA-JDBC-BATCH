package abstraction;

public class ex {
//try block
	public static void main(String[] args) {
		try {
			// code that may raise exception
			int data = 100 / 10;
			// catch block
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// reset code of the program
		System.out.println("rest of the code...");
		System.out.println("learning about Exception");
		System.out.println("remaining will be the same");

	}
}
