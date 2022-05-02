import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeAssn {
	
	static void displayInfo() {
		Calendar cal = Calendar.getInstance();
	        System.out.println("Year: " + cal.get (Calendar. YEAR));
	        System.out.println("Month: " + cal.get (Calendar. MONTH));
	        System.out.println("Day: " + cal.get (Calendar. DATE));
	        System.out.println("Hour: " + cal.get (Calendar. HOUR));
	        System.out.println("Minute: " + cal.get (Calendar. MINUTE));

	}
	
	static void getCurrentTime() {
	     Calendar losAngeles = Calendar.getInstance();
	     losAngeles.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
	       System.out.println(); 
	      System.out.println("Time in LOS ANGELES: " + losAngeles.get (Calendar.HOUR_OF_DAY) + ":" + losAngeles.get (Calendar. MINUTE) +":"+losAngeles.get(Calendar. SECOND));

	}
	
	static void getFirstLast() {
		YearMonth ym = YearMonth.of(2016, 9);

		 String firstDay = ym.atDay(1).getDayOfWeek().name();
		 String lastDay = ym. atEndOfMonth(). getDayOfWeek ().name ();
		 System.out.println();
		 System.out.println(firstDay);
	 	 System.out.println(lastDay);
		 System.out.println();

	}
	
	static void dateAfterTwoWeeks()
	{
	     int noOfDays = 14; 
	     Calendar cal = Calendar.getInstance();
	     Date cdate = cal.getTime();
	     cal.add(Calendar.DAY_OF_YEAR, noOfDays);
	     Date date = cal.getTime();
	     System.out.println("\nCurrent Date: " + cdate+"\n");  
	     System.out.println("Day after two weeks: " + date+"\n");  	

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayInfo();
		getCurrentTime();
		getFirstLast();
		dateAfterTwoWeeks();
		
	}

}
