import java.util.Arrays;

public class ArrayExamp {
	
	// Accessing each elements of array using for loop
	static void printEachArray(int arr[]) {
		for(int i=0; i <arr.length;i++) {
			System.out.println("Element"+(i+1)+"----"+arr[i]);
		}
	}
	
	// Using for each
	static void printElements(int arr[]) {
		for(int i :arr) {
			System.out.println(i);
		}
	}
	
	// print sum and average
	static void printAvgAndSum(int numbers[]) {
		int sum = 0;
		   Double average;
		   
		   // access all elements using for each loop
		   // add each element in sum
		   for (int number: numbers) {
		     sum += number;
		   }
		  
		   // get the total number of elements
		   int arrayLength = numbers.length;

		   // calculate the average
		   // convert the average from int to double
		   average =  ((double)sum / (double)arrayLength);

		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);

	}
	
	// copy by assign
	static void easyCopy(int numbers[]){
        int [] positiveNumbers = numbers;    // copying arrays

        for (int number: positiveNumbers) {
            System.out.println(number + ", ");
        }
	}
	
	// copy through loop
	static void loopCopy(int [] source) {
        int [] destination = new int[5];

        // iterate and copy elements from source to destination
        for (int i = 0; i < source.length; ++i) {
            destination[i] = source[i];
        }
      
         // converting array to string
        System.out.println(Arrays.toString(destination));

	}
	
	// a little bit advanced copy
	static void advanced(int []n1) {
        int[] n3 = new int[5];

        // Creating n2 array of having length of n1 array
        int[] n2 = new int[n1.length];
      
        // copying entire n1 array to n2
        System.arraycopy(n1, 0, n2, 0, n1.length);

        System.out.println("n2 = " + Arrays.toString(n2)); 
// copying elements from index 2 on n1 array
        // copying element to index 1 of n3 array
        // 2 elements will be copied
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));  

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Simple method to call each elements and print in an array
		int givenArray[]= {7,19,18,3,56};
		System.out.println("Element at one------"+givenArray[0]);
		System.out.println("Element at two------"+givenArray[1]);
		System.out.println("Element at three------"+givenArray[2]);
		System.out.println("Element at four------"+givenArray[3]);
		System.out.println("Element at five------"+givenArray[4]);
		System.out.println("   ");
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println("   ");
		
		
		// Calling methods 
		printEachArray(givenArray);
		
		System.out.println("   ");
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println("   ");
		
		//Using for each --made method for this 
		printElements(givenArray);
		System.out.println("--------------------------");
		printAvgAndSum(givenArray);
		System.out.println("       ");
		System.out.println("-------------copy by assign, Easy Pg huh -------------");
		easyCopy(givenArray);
		System.out.println("--------------looping and copying array-----------");
		loopCopy(givenArray);
		System.out.println("--------------------------");
		advanced(givenArray);
	}

}
