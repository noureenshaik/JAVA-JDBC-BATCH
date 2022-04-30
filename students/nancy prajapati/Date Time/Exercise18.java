//Write a Java program to check a year is a leap year or not.

public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// year to leap or not

		int year = 2016;
		System.out.println();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
		System.out.println();

	}

}
