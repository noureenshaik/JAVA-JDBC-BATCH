import java.util.Calendar;
import java.util.Date;

public class GetDateAfter2Weeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// two weeks
		int noOfDays = 14;

		Calendar cal = Calendar.getInstance();
		Date cdate = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date date = cal.getTime();
		System.out.println("\nCurrent Date: " + cdate + "\n");
		System.out.println("Day after two weeks: " + date + "\n");

	}

}
