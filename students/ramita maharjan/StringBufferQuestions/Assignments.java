package StringBufferQuestions;
import java.util.Calendar;

public class Assignments {
	public static void main(String args[]) {
//		//1.	 Write a Java program to compare a given string to the specified string buffer?
		String str = "book";
		String ss = "book";
		StringBuffer sb = new StringBuffer("book");
		System.out.println("String " + str + " and Stringbuffer " + ss+ " are equal? " + sb.equals(str));
		
//		//2.	Write a Java program to create a new String object with the contents of a character array?
		Character[] chArr = {'j','a','v','a'};
		String st = String.valueOf(chArr);
		
		//3.	Write a Java program to check whether a given string ends with the contents of another string?
		System.out.println("String " + str + " ends with ok? " + str.endsWith("ok"));
		
		//4.	Write a Java program to check whether two String objects contain the same data?
		System.out.println("String " + str + " and " + ss + " contains same data? "+ str.equals("book"));
		
//		5.	Write a Java program to print current date and time in the specified format?
		Calendar c = Calendar.getInstance();
	      System.out.println("Current Date and Time :"); 
	      System.out.format("%tB %te, %tY%n", c, c, c);
	      System.out.format("%tl:%tM %tp%n", c, c, c); 
		
		
//		6.	Write a Java program to get the contents of a given string as a byte array?
		byte[] byteArray = str.getBytes();
		String s = new String(byteArray);
		System.out.println("String formed from byteArray "+ s);
		
	}
}
