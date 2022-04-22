import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] age = { 12, 4, 5, 2, 5 };

		System.out.println("Accessing Element of Array :");
		System.out.println("First Element: " + age[0]);
		System.out.println("Second Element: " + age[1]);
		System.out.println("Third Element: " + age[2]);
		System.out.println("Fourth Element: " + age[3]);
		System.out.println("Fifth Element: " + age[4]);
		System.out.println();

		int[] ageloop = { 12, 4, 5 };

		System.out.println("Using for-each loop: ");
		for (int a : ageloop) {
			System.out.println(a);
		}
		System.out.println();

		int numbers[] = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
		int sum = 0;
		double average;
		for (int number : numbers) {
			sum += number;
		}

		average = (double) sum / (double) numbers.length;

		System.out.println("Sum = " + sum);
		System.out.println("Average: " + average);
		System.out.println();

		int[] source = { 1, 2, 3, 4, 5, 6 };
		int[] destination = new int[6];
		
		for(int i =0; i<source.length; ++i)
		{
			destination[i] = source[i];
		}
		System.out.println("Arrays to String: ");
		System.out.println(Arrays.toString(destination));
		System.out.println();

        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n3 = new int[5];
        int[] n2 = new int[n1.length];
      
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2)); 

        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));  
	}
}
