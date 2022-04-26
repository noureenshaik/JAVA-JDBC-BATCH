package fifth_ArrayDimentsion;

public class OneDimensionArray {

    public static void main(String[] args) {
        // Declares an one dimnesional array of integers
        int[] anArray;

        // Allocates memory for 3 integers
        anArray = new int[3];

        //initilizes first elements
        anArray[0] = 4;

        //initilizes second elements
        anArray[1] = 10;

        //initilizes 3rd elements

        anArray[2] = 14;

        System.out.println("Printing one dimension array : ");
        System.out.println("Element at index 0 : " + anArray[0]);
        System.out.println("Element at index 1 : " + anArray[1]);
        System.out.println("Element at index 2 : " + anArray[2]);


    }
}
