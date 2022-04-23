package AssignmentForLoop.Assignment3ForLoop;

public class ContinueNestedLoop {
    public static void main(String[] args) {
        int i = 1, j = 1;
        while (i <= 3) {
            System.out.println("outer Loop: " + i);


            while (j <= 3) {
                j++;
                continue;
            }
        }
        System.out.print("inner loop" + j);
        j++;

    }


}
