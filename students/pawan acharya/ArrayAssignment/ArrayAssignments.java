
public class ArrayAssignments {
	/*
	 * @Author:Pawan Acharya
	 */

	// sorting in O(n^2); not an efficient way
	static void sortNumericArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(arr[i]);
		}
		
	}
	
	// sort the string array
	static void sortStringArray(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String temp ="";
				if (arr[i].compareTo(arr[j])>0) {
					temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		
	}
	
	// Sum the values of an array
	static void sumInArray(int arr[]) {
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("The sum of all the elements of array:  "+sum);
	}
	
	
	// Average of array elements
	static void avgArray(int arr[]) {
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}
		int avg =sum/arr.length;
		System.out.println("The Average of all the elements of array:  "+avg);
	}
	
	// To test if the array contains specific element
	static void testContains(int e, int arr[]) {
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==e) {
				count++;
				if (count ==1) {
					System.out.println("Yes, the element "+ e+" contains in the array" );
				}
				else {
					System.out.println("Wow " + e +" appears "+count+ " times in the array" );
				}
				
			}
			
		}
		if (count ==0) {
			System.out.println("No, the element "+ e+" is not a part of the array" );
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question Number 1 ------------------------------------------------
		int[] arr = new int[] {78, 34, 1, 3, 90, 34};  
		sortNumericArray(arr);
		
		String[] arr1 =new String[] {"Pawan", "Emon", "Deepan", "Pratham"};
		sortStringArray(arr1);
		
		// Question Number 2 --------------------------------------------
		sumInArray(arr);
		
		// Question Number 3
		avgArray(arr);
		
		// Question Number 4
		int element =3;
		testContains(element, arr);
	}
}

