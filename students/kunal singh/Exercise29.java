package twelveth_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//Write a Java program to convert a string to date.
public class Exercise29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "May 1, 2016";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(string, formatter);
		System.out.println();
		System.out.println(date);
		System.out.println();

	}

}
