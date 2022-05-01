package stringbuffer;

//Check whether two String objects contain the same data

public class CheckTwoStringContainSameData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String columnist1 = "Stephen Edwin King";
	        String columnist2 = "Walter Winchell";
	        String columnist3 = "Mike Royko";

	        // Are any of the above Strings equal to one another?
	        boolean equals1 = columnist1.equals(columnist2);
	        boolean equals2 = columnist1.equals(columnist3);

	        // Display the results of the equality checks.
	        System.out.println("\"" + columnist1 + "\" equals \"" +
	            columnist2 + "\"? " + equals1);
	        System.out.println("\"" + columnist1 + "\" equals \"" +
	            columnist3 + "\"? " + equals2);

	}

}
