package stringbuffer;


//Write a Java program to create a new String object with the contents of a character array.
public class StringObjContentsCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Character array with data.
		char[] arr_num = new char[] { '1', '2', '3' , '4' };
		
		//create a string containig the contents of arr_num
		// starting at index 1 for length 2.
		String str = String.copyValueOf(arr_num, 1, 3);
		
		//Display the results of the new string.
		System.out.println("\nThe book contains " + str + " pages.\n"); //The book contains 234 pages.

	}

}
