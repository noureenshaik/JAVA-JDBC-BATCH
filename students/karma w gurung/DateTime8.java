import java.time.*;
		import java.util.*;
public class DateTime8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		// date of birth
		        LocalDate pdate = LocalDate.of(1992, 01, 19);
		        // current date
		        LocalDate now = LocalDate.now();
		        // difference between current date and date of birth
		        Period diff = Period.between(pdate, now);
		 
		     System.out.printf("\nI am  %d years, %d months and %d days old.\n\n",diff.getYears(), diff.getMonths(), diff.getDays());
		   }
		}

