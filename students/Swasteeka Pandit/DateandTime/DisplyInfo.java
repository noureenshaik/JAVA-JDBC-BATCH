import java.util.Calendar;

public class DisplyInfo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a default calender

		Calendar cal = Calendar.getInstance();

		// Get and display imformation of current date from the calendar

		System.out.println();

		System.out.println("Year:" + cal.get(Calendar.YEAR));

		System.out.println("Month:" + cal.get(Calendar.MONTH));

		System.out.println("Day:" + cal.get(Calendar.DATE));

		System.out.println("Hour:" + cal.get(Calendar.HOUR));

		System.out.println("Minute:" + cal.get(Calendar.MINUTE));

		System.out.println();
	}

}
