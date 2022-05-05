package tenthAdditionalAssignmentString;

import java.util.Calendar;

public class CalenderExercise {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time :");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
