package forth_Array;

import java.util.Arrays;

public class SortNumbericStringArray {
    public static void main(String[] args) {
        int numeric[] = {2,0,10,100,83};
        String st [] = { "Ravi", "Santa", "Arbin","Xera"};
        Arrays.sort(numeric);
        Arrays.sort(st);
        for (int i =0; i<numeric.length;i++){
            System.out.print( numeric[i]+" "+"\t");
        }

        for (int i =0; i<st.length;i++){
            System.out.print(st[i]+" ");
        }





    }
}
