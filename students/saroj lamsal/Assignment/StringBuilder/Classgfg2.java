package workshop;

public class Classgfg2 {

	public static void main(String[] args) {
		// create a StringBuilder object
		// with a String pass as parameter
		StringBuilder
		str
		= new StringBuilder("WelcomeGeeks");
		// print string
		System.out.println("String is" + str. toString());
		// loop through string and print every Character
		for (int i = 0; i < str.length(); i++) {
	    // get char at position i
		char ch = str.charAt(i);
		// print char
		System.out.println("char at position" + i + " is " + ch);
		}

	}

}
