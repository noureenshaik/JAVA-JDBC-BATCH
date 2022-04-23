
public class ArrayAverage {

	public static void main(String []args) {
		int [] arr= {23,25,2,-34,54,66,32,-43,11,2};
		int sum=0;
		for(int i:arr) {
			 sum+=i;
		}
		System.out.println("The average of Array is "+sum/2);
		double average=(double)sum/2;
		System.out.println(average);
		byte averageByte=(byte)(sum/2);
		System.out.println(averageByte);
	}
}
