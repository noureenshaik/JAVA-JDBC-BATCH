package strings;

public class CreateString {
	public static void main(String[] args) {
	    
	    // create strings
	    String first = "JaVa";
	    String second = new String("PyThoN");
	    
	    // print strings and their lengths
	    System.out.println(first + " has length " + first.length());   
	    System.out.println(second + " has length " + second.length());  
	    
	    //concatenate two strings
	    String joined = first.concat(second);
	    System.out.println(first + " concatenated with " + second + " gives " + joined + " and has length " + joined.length());
	  
	    //comparing two strings
	    System.out.println("\n\nAre strings " + first + " and " + second + " equal? " + first.equals(second));
	    String f = new String("java");
	    String s = new String("Java");
	    System.out.println("Are strings " + f + " and " + s + " equal? " + f.equals(s));
	    String fi = new String("Java");
	    String se = new String("Java");
	    System.out.println("Are strings " + fi + " and " + se + " equal? " + fi.equals(se));
	    System.out.println("Are strings " + fi + " and " + se + " == ? " + (fi == se));
	
	    //toUpperCase and toLowerCase
	    System.out.println("\nTo uppercase to " + second + " gives " + second.toUpperCase());
	    System.out.println("To lowercase to " + second + " gives " + second.toLowerCase());
	
	    // trim to remove leading and trailing spaces
	    String ss = "  String is an   ";
	    System.out.println("Trimmning the string " + ss + "gives " + ss.trim());
	    
	    // Starts with and ends with
	    System.out.println("\n String " + second + "starts with P ? " + second.startsWith("P") + "\n ends with oN? " + second.endsWith("oN") + "\n starts with py? " + second.startsWith("py"));
	
	    //charAt
	    System.out.println("\n The character at 3rd index in " + second + " is " + second.charAt(3));
	    
	    //replace
	    String str = "whatever you want to know what is going on";
	    System.out.println("Replacing what with where in \"" + str + "\" " + str.replace("what", "where"));
	}

}
