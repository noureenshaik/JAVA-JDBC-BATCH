package Dimensions;

public class OneDimensionalArrayString {
	public static void main(String args[]) 
    {
      // Declaring and Initializing the String Array
      String[] strArray = {"Alive is Awesome", "Be in Present","Be Yourself"};
      System.out.println("The length of String Array is: "+strArray.length);
      // Printing the One Dimensional String Array
      System.out.println("Displaying One dimensional String array elements:");
      for( int i=0; i < strArray.length ; i++)
      {
          System.out.println(strArray[i] + " ");
      }      
    }
}


