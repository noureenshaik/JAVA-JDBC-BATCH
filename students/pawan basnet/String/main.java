package Strings;

public class main {

	public static void main(String[] args) {
		String first = "Java";
		String second = "Pytho";
		String third = "JavaScript";

		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println("");
		
		String greet =  "Hello! World";
		System.out.println("String: "+  greet);
		
		int length = greet.length();
		System.out.println("Length "+length);
		System.out.println("");
		
		String lang = " Programming";
		String joinString = first.concat(lang);
		System.out.println("Joined String: "  + joinString);
		System.out.println("");
		
		String java = "Java Programming";
		String java2 = "Java Programming";
		String py = "Python Programming";
		boolean result1  =  java.equals(java2); 
		System.out.println("String First and Second are equal: "+  result1);
		boolean result2 = java.equals(py);
		System.out.println("String First and Second are equal: "+  result2);
		System.out.println("");
		
		String s = "This Is a String";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println("");
		
		System.out.println("Checking if s starts With Th" + s.startsWith("Th"));
		System.out.println("Checking if s ends With ng" + s.endsWith("ng"));
		System.out.println("");
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		System.out.println("");

		String rep = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = rep.replace("Java", "Kava");
		System.out.println(replaceString);			
	}
}