package first_Funamental;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fname= sc.next();

        System.out.println("Enter your last name: ");
        String lname= sc.next();

        String FullName= fname+" " +lname;
        System.out.println();

        System.out.println("Hello \n "+FullName);

    }
}
