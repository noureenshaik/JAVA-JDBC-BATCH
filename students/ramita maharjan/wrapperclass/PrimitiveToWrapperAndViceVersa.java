package wrapperclass;

public class PrimitiveToWrapperAndViceVersa {
	public static void main(String args[]){  
		//Converting int into Integer  
		int a = 200;  
		//converting int into Integer explicitly
		// DEPRECATED
		Integer i=Integer.valueOf(a);  
		//autoboxing, now compiler will write Integer.valueOf(a) internally 
		Integer j=a; 
		System.out.println("a = " + a + " i = "+i+" j = "+j);  

		// Integer to int
		int k = j; // unboxing
		//explicit conversion from Wrapper class Integer to int primitive data type
		//DEPRECATED
		int l = j.intValue(); 
		System.out.println("j = " + j + " k = "+ k +" l = "+l);  
	}
}
