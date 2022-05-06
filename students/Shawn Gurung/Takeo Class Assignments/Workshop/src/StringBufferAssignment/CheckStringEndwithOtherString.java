package StringBufferAssignment;

public class CheckStringEndwithOtherString {
	public static void main(String[] args)
    {
        String str1 = "Mark Spector";
        String str2 = "Steven Grant";

        // The String to check the above two Strings to see
        // if they end with this value (or).
        String end_str = "or";

        // Check first two Strings end with end_str
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        // Display the results of the endsWith calls.
        System.out.println("\"" + str1 + "\" ends with " +
            "\"" + end_str + "\"? " + ends1);
        System.out.println("\"" + str2 + "\" ends with " +
            "\"" + end_str + "\"? " + ends2);
    }
}
