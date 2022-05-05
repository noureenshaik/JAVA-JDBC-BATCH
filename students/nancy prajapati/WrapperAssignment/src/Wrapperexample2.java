//java progarmme to convert object into primitives
//Unboxing example of integer to int

//Wrapper to Primitive


public class Wrapperexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Converting Integer to int
		Integer a = new Integer(4);
		int i = a.intValue();// converting integer to int explicity
		int j = a; // unboxing now compiler will write a.intValue()internally

		System.out.println(a + " " + i + " " + j);

	}

}
