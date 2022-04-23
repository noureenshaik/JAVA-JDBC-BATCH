package forth_Array;

import java.util.Arrays;

public class ConstructCopyArray {
    public static void main(String[] args) {
        //create an array
        int[] source = {12, 5, 3, 9, 0};
        int[] destination = new int[6];

        //iterate and copy elements from source to destination
        for(int i=0; i<source.length;++i){
            destination[i]=source[i];
        }
        //converting array to string
        System.out.println(Arrays.toString(destination));

    }

    }


