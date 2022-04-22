package AssignmentForLoop.Assignment3ForLoop;

import java.util.Scanner;

public class LaveledBreak {
    public static void main(String[] args) {
        first:
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 3; j++) {
                if (i == 2)
                    break first;
            }
        }
    }
}



