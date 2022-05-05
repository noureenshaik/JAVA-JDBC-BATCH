import java.util.Calendar;
import java.util.TimeZone;

public class CalculateCurrentTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar calny = Calendar.getInstance();

		calny.setTimeZone(TimeZone.getTimeZone("New_York"));

		System.out.println();

		System.out.println("Time in New York:" + calny.get(Calendar.HOUR_OF_DAY) + ":" + calny.get(Calendar.MINUTE)
				+ ":" + calny.get(Calendar.SECOND));
		System.out.println();

	}
}
