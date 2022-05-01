package datetime;

import java.time.Instant;

public class CurrentTimeStamp {
	public static void main(String[] args){
	    Instant timestamp = Instant.now(); 
	    System.out.println("\nCurrent Timestamp: " + timestamp+"\n"); 
    }

}
