package DateTime;

import java.time.Instant;

public class GetCurrentTimeStamp {
	public static void main(String[] args)
    {
    Instant timestamp = Instant.now(); 
    System.out.println("\nCurrent Timestamp: " + timestamp+"\n"); 
    }

}
