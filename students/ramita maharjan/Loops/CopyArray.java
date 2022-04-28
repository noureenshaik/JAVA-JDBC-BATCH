package Loops;

public class CopyArray {
	public static void main(String[] args) {
	       
        int [] src = {31, 42, 3, 24, 5, 96};
        int [] dest = src;    // copying arrays

        for (int num: src) {
            System.out.print(num + " ");
        }
    }

}
