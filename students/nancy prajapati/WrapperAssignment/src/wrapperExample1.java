//Java program to convert primitive into objects  
//Autoboxing example of int to Integer 

//Primitive to Wrapper

public class wrapperExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Converting int into Integer

		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally
		System.out.println(a + " " + i + " " + j);

	}

}
