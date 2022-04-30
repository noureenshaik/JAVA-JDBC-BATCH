package DateTime;

import java.time.YearMonth;
import java.util.*;
import java.text.*;

public class GetFirstandLastDay {
	public static void main (String []args){
	     YearMonth ym = YearMonth.of(2016, 9);

		 String firstDay = ym.atDay(1).getDayOfWeek().name();
		 String lastDay = ym. atEndOfMonth(). getDayOfWeek ().name ();
		 System.out.println();
		 System.out.println(firstDay);
	 	 System.out.println(lastDay);
		 System.out.println();
	     }

}
