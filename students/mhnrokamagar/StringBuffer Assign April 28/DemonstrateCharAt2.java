package stringbuffer;

public class DemonstrateCharAt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a StringBuilder object
		//with a string pass as parameter
		StringBuilder str= new StringBuilder("WelcomeGeeks");
		
		//print string
		System.out.println("String is " + str.toString());
		
		//loop through string string and print every charcter
		for(int i = 0; i < str.length(); i++) {
			//get char at position i 
			char ch = str.charAt(i);
			
			//print char
			System.out.println("Char at Position" + i + " is " + ch);
		}
		

	}

}
