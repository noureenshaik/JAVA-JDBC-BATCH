package abstraction;

public class trycatch {
	public static void main(String[] args) {
		int i = 100;
		int j = 0;
		int data;
		try {
			data = i / j; // mat throw exception
		}
		// handling the exception
		catch (Exception e) {
			// resolving the exception in catch block
			System.out.println(i / (j + 2)); // 100/0+2+100/2=24
		}
	}
}
