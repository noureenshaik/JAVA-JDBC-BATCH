import java.util.Calendar;
import java.util.TimeZone;

//Write a Java program to get the current time in New York.

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calNewYork = Calendar.getInstance();

		calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));

		System.out.println();

		System.out.println("Time in New York:" + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
				+ calNewYork.get(Calendar.MINUTE) + ":" + calNewYork.get(Calendar.SECOND));
		System.out.println();

	}

}
