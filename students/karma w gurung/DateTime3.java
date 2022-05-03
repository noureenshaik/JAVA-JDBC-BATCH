import java.util.*;
import java.time.*;
import java.text.*;

public class DateTime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YearMonth ym = YearMonth.of(2016, 9);

			 String first_Day = ym.atDay(1).getDayOfWeek().name();
			 String last_Day = ym. atEndOfMonth(). getDayOfWeek ().name ();
			 System.out.println();
			 System.out.println(first_Day);
		 	 System.out.println(last_Day);
			 System.out.println();
		     }
}
