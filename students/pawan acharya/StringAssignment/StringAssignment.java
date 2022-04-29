
public class StringAssignment {
	
	static void printString(String s) {
		System.out.println(s);
	}
	
	static void charAt(int n,String s) {
		System.out.println("The character at index "+n+ " is "+s.charAt(n));
	}
	
	static void compareString(String first, String second) {
		boolean result = first.equals(second);
        System.out.println("Comparing 1st and 3rd string: "+ result);
	}
	
	static void concatString(String first, String second) {
		String concatedString = first.concat(second);
        System.out.println("After concatination : "+ concatedString);
	}
	
	static void findLength(String s) {
		int length = s.length();
        System.out.println("Length of String is : "+ length);
	}
	
	static void replaceString(String g,String s, String r) {
		String replaceString = s.replace(s,r);
        System.out.println( replaceString);
	}
	
	static void check(String given, String start, String end) {
		 System.out.println( given.startsWith(start));
	     System.out.println( given.endsWith(end));
	}
	
	static void trimString(String s) {
		System.out.println(s);
		System.out.println(s.trim());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling methods here
		charAt(2,"Pawan");
		compareString("Pawan", "pawan");
		compareString("Emon", "Emon");
		concatString("Pawan","Acharya");
		findLength("America");
		String s="Pawan";
		printString(s);
		replaceString("My love", "love","hate");
		
		 String s1 = "hire me       ";
		 check(s1,"h","e");
		 check(s1,"p","me");
		 trimString(s1);
	       

	}

}
