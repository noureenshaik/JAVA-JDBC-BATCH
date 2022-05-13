
public class InterviewQuestion2 {

	public static void main(String [] args) {
		int i=10;
		int j=20;
		
		System.out.println("Before Swapping i= "+i+" and j= "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		
		System.out.println("After Swapping i= "+i+" and j= "+j);
		//swapping three numbers
		i=10;
		j=20;
		int k=30;
		System.out.println("Before Swapping three number \n i= "+i+"\nj= "+j+"\nk= "+k);
		i=i+j+k;
		j=i-j-k;
		k=i-j-k;
		i=i-j-k;
		System.out.println(i+" "+j+" "+k);
	
	}
}
