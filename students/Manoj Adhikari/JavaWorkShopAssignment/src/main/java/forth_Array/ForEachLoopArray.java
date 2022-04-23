package forth_Array;

public class ForEachLoopArray {
    public static void main(String[] args) {
       //create an array
        int[]age={12,5,3,9,0};
        System.out.println("Using for-each loop");
        for(int i :age){
            System.out.print(i+ " ");
        }
    }
}
