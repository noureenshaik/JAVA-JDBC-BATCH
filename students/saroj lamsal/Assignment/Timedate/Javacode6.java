package workshop;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Javacode6 {

	public static void main(String[] args) {
		String string = "May 1,2016";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d,yyyy");
		LocalDate date = LocalDate.parse(string,formatter);
		System.out.println();
		System.out.println(date);
		System.out.println();
		

	}

}
