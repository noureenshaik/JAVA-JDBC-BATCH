package forth_Array;

public class SumAvarageArray {
    public static void main(String[] args) {
       //create an array
        int[] number ={12,5,3,9,0};
        int sum=0;
        Double average;
        //Sum

        for(int num :number) {
            sum += num;
        }
            //get the total number of elements
            int arrayLenght = number.length;

            //calculate avarage
            //conver the average form in to double
            average = ((double)sum/(double) arrayLenght);

            System.out.println("Sum = "+sum);
            System.out.println("Average = "+average);

        }

    }


