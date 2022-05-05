package stringBuilder;

//Write a Java program to convert a string to date.



import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class ConvertStringToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "June 1, 2019";
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		   LocalDate date = LocalDate.parse(string, formatter);
		   System.out.println();
		   System.out.println(date);
		   System.out.println();

	}

}


//output: 2019-06-01