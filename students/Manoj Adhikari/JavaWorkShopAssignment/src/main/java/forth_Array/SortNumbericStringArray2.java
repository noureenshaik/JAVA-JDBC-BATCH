package forth_Array;

import java.util.Arrays;

public class SortNumbericStringArray2 {
    public static void main(String[] args) {
        int numeric[] = {2,0,10,100,83};
        String st [] = { "Ravi", "Santa", "Arbin","Xera"};

        System.out.println("Before sorting ");
        for (int i =0; i<numeric.length;i++){
            System.out.print( numeric[i]+" "+"\t");
        }
        System.out.println();
        System.out.println("After Sorting :");


        for(int i=0;i<numeric.length;++i)
        {
            for(int j=i;j<numeric.length-1;++j)
            {
                //swaping
                int temp=0;
                if(numeric[i]>numeric[j+1])
                {
                    temp=numeric[i];
                    numeric[i]=numeric[j+1];
                    numeric[j+1]=temp;
                }
            }

            //print sorted array lements
            System.out.print(numeric[i]+"\t ");
        }

    }



    }

