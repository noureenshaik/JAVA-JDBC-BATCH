package stringBuilder;

// Write a Java program to get current timestamp.


import java.time.*;


public class GetCurrentTimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instant timestamp = Instant.now(); 
	    System.out.println("\nCurrent Timestamp: " + timestamp+"\n"); 

	}

}
// output : Current Timestamp: 2022-04-30T03:09:39.842162Z