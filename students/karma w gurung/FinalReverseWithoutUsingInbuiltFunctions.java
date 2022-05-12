
public class FinalReverseWithoutUsingInbuiltFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     String str = "Saket Saurav";
	        char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
	        for(int i= chars.length-1; i>= 0; i--) {
	            System.out.print(chars[i]);
	        }
	    }
	}

