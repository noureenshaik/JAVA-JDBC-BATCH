package Seventh_String;

public class ConcatString {
    public static void main(String[] args) {

        String first = "Java";
        System.out.println("First String: " + first);

        String second = " Python";
        System.out.println("First String : " + second);

        //Joining two string
        String joinedString = first.concat(second);
        System.out.println("Joined String: "+ joinedString);

    }
}
