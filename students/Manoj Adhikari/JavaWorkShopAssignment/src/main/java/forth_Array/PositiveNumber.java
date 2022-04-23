package forth_Array;

public class PositiveNumber {
    public static void main(String[] args) {
        int[] number ={12,5,3,9,0};
        int[] positiveNumbers = number;

        for(int num:positiveNumbers){
            System.out.print(num+", ");
        }

    }
}
