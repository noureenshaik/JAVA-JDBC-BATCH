package twelveth_DateTime;

import java.time.LocalDate;
import java.time.Period;

//Write a Java program to calculate your age.
public class Exercise32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// date of birth

		LocalDate pdate = LocalDate.of(1989, 04, 11);
		// current date
		LocalDate now = LocalDate.now();
		// difference between current date and date of birth
		Period diff = Period.between(pdate, now);

		System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());

	}

}
