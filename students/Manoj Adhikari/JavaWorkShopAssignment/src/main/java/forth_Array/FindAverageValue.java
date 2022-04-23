package forth_Array;

public class FindAverageValue {

    public static void main(String[] args) {



    int numbers[]={1,2,3,4,5,6,7,8,9,10};
    int sum=0;
    Double average;
    //Sum
    for(int num: numbers){
        sum+=num;
    }
    // Lenght of array
        int arrayLenght = numbers.length;

    //Average
        average=((double)sum/(double)arrayLenght);


        System.out.println("The sum value for the array is: "+ sum);
        System.out.println("The average value for the array is: "+ average);

    }
}
