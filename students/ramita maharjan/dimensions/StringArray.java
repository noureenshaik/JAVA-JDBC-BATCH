package dimensions;

public class StringArray {
	public static void main(String args[]) 
    {
      // Declaring and Initializing the String Array
      String[] strArray = {"Act Smart", "Be in Present","Be Yourself"};
      System.out.println("The length of String Array is: "+strArray.length);
      
      // Printing the One Dimensional String Array
      System.out.println("Displaying One dimensional String array elements:");
      for(String st: strArray)
      {
          System.out.println(st + " ");
      }      
    }
}

