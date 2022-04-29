package forloop;

public class JavaContinue {
	public static void main(String[] args) {

	    // for loop
	    for (int i = 1; i <= 15; ++i) {

	      // if value of i is between 4 and 9
	      // continue is executed
	      if (i > 5 && i < 12) {
	        continue;
	      }
	      System.out.println(i);
	    }
	  }

}
