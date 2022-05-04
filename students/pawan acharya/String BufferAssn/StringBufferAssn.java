import java.util.Calendar;

public class StringBufferAssn {
	
	// 1. Write a Java program to compare a given string to the specified string buffer?
	static void compareString(String str1, String str2) {
		 StringBuffer strbuffer = new StringBuffer(str1);
		 System.out.println( str1.contentEquals(strbuffer));
		 System.out.println( str2.contentEquals(strbuffer));
	}
	
	// 2.	Write a Java program to create a new String object with the contents of a character array?
	static void createString(char arr_num[]) {
		String str = String.copyValueOf(arr_num, 1, 3);
		 System.out.println(str);
	}
	
	// 3.	Write a Java program to check whether a given string ends with the contents of another string?
	static void endsWith(String str) {
		System.out.println(str.endsWith("acharya"));
	}
	
	// 4.	Write a Java program to check whether two String objects contain the same data?
	static void checkEquals(String str1, String str2) {
		System.out.println(str1.equals(str2));
	}
	
	// 5.	Write a Java program to print current date and time in the specified format?
	static void printDateAndTime() {
		Calendar c = Calendar.getInstance();
	      System.out.println("Current Date and Time :"); 
	      System.out.format("%tB %te, %tY%n", c, c, c);
	      System.out.format("%tl:%tM %tp%n", c, c, c); 
	}
	
	// 6.	Write a Java program to get the contents of a given string as a byte array?
	static void getContents(String str)
	{
		 byte[] byte_arr = str.getBytes();
		 String new_str = new String(byte_arr);
		 System.out.println("\nThe new String equals " +
		            new_str + "\n");
		 System.out.println("byte array: "+ byte_arr);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calling methods here
		String str1="PawanAcharya";
		String str2 ="pawanAcharya";
		compareString(str1, str2);
		char[]arr =new char[] {'1', '2', '2','7'};
		createString(arr);
		String str ="Pawanacharya";
		endsWith(str);
		String str3="pawan";
		String str4 ="pawan";
		checkEquals(str3,str4);
		printDateAndTime();
		getContents(str);
		
	}

}
