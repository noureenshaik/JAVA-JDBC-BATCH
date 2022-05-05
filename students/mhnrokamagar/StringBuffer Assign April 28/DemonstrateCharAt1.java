package stringbuffer;

//Java program to demonstrate
//the charAt() Method.

public class DemonstrateCharAt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a StringBuilder object
		StringBuilder str = new StringBuilder();
		
		//add the string to StringBuilder object
		str.append("Geek");
		
		//get char at position 1
		char ch = str.charAt(1);
		
		//print the result
		System.out.println("StringBuilder Object"
				+ " contains = " + str);
		System.out.println("Character at Position 1"
				+ " in StringBuilder = " + ch);



	}

}
