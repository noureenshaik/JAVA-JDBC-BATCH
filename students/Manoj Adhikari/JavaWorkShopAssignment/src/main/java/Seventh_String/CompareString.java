package Seventh_String;

public class CompareString {
    public static void main(String[] args) {
//1st string
        String first = "Java";
        System.out.println("First String: " + first);
//2nd string

        String second = " Python";
        System.out.println("First String : " + second);

        //3rd string
        String third = "Java";
        System.out.println("First String : " + third);


        //Comparing 1st and 3rd string
        boolean result = first.equals(third);
        System.out.println("Comparing 1st and 3rd string: "+ result);

        //Comparing 1st and 3rd string
        boolean result1 = first.equals(second);
        System.out.println("Comparing 1st and 2nd string: "+ result1);

    }
}
