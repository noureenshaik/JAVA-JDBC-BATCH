package Strings;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringBuffCompare {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello Java");
		String comp = "Hello Java";
		String comp2 = "Helo Jav";
		
		System.out.println("Comparing the "+sb + " "+ comp +" "+ comp.contentEquals(sb));
		System.out.println("Comparing the "+sb + " "+ comp2 +" "+ comp2.contentEquals(sb));
		
		char[] ch = {'J', 'a', 'v','a','S','t','r','i','n','g'};
		String toString="";
		System.out.println(toString.copyValueOf(ch));
		
		String endString = "Checking the end";
		String last = "end";
		System.out.println("Checking if " +endString+ "ends with " +last+ " " + endString.endsWith(last));
		
		String first = "Check Java";
		String sec = "Check Java";
		String third = "Chec Jav";
		System.out.println("Checking if "+first+" is equal to "+sec+" "+ first.compareTo(sec));
		System.out.println("Checking if "+first+" is equal to "+third+" "+ first.compareTo(third));
		
		LocalDateTime myLocal = LocalDateTime.now();
		DateTimeFormatter myDateTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
		String fDateTime = myLocal.format(myDateTime);
		System.out.println("The Date and time right now is " + fDateTime);
		
		byte[] arr = first.getBytes();
			
		String firstArr = new String (arr);
		System.out.println("Byte array is "+ arr+" and Byte array string is "+firstArr);
		}
	}


