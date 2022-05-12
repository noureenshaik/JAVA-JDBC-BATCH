package interview;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//try block
			int data=100/0;
		
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			//rest code of the program
		}
		System.out.println("rest of the code");
		System.out.println("learning about exception");
		System.out.println("remaining will be the same");
		

	}

}
