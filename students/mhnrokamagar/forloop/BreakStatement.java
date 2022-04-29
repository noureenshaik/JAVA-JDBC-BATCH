package forloop;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  // for loop
        for (int i = 1; i <= 10; ++i) {

            // if the value of i is 5 the loop terminates  
            if (i == 5) {
                break;
            }      
            System.out.println(i);
        }   
    }
}
