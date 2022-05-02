package Wrapper;

//Java program to conver object into primitives 
		// unboxing example of Integer to int
		

public class UnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// converting Integer to int
		Integer a=new Integer(3);
		int i=a.intValue(); // converting Integer to int expllicitly
		int j=a; //unboxing now compiler will write a.intValue() internally
		
		System.out.println(a+""+i+""+j);
		

	}

}
//output : 333