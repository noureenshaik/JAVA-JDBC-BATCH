package StringBufferAssignment;

public class CheckStringContainSameData {
	public static void main(String[] args)
    {
        String columnist1 = "Lucario";
        String columnist2 = "Garschomp";
        String columnist3 = "Mega Lucario";

        // Are any of the above Strings equal to one another?
        boolean equals1 = columnist1.equals(columnist2);
        boolean equals2 = columnist1.equals(columnist3);

        // Display the results of the equality checks.
        System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist2 + "\"? " + equals1);
        System.out.println("\"" + columnist1 + "\" equals \"" +
            columnist3 + "\"? " + equals2);
    }
}
