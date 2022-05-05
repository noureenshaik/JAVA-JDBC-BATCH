package Thursday;

public class array {

	public static void main(String[] args) {
		
		// array used to sotr multiple values in a single vairbale
		//String [] cars = {"camery","Honda","Tesla","BMW"};
		//cars [0]="Mustang";
		
		//System.out.println(cars[1]););
		
		//another way
		
		String [] cars = new String [3];
		cars  [0] ="Mango";
		cars [1] = "Ampple";
		cars [2]= "Agg";
		
		//System.out.println(cars[2]);
		
		for(int i =0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	
	}

}
