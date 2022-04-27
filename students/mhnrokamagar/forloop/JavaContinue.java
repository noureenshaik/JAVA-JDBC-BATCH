package forloop;

public class JavaContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // for loop
	    for (int i = 1; i <= 10; ++i) {

	      // if value of i is between 4 and 9
	      // continue is executed
	      if (i > 4 && i < 9) {
	        continue;
	      }
	      System.out.println(i);
	    }
	  }
	}
