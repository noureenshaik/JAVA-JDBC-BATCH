package workshop;


//java program to convert primitive into objects

//Autoboxing example of into to Integer


public class Wrapperclass {

	public static void main(String[] args) {
	//Converting int into Integer int a = 20;
	Integer i=Integer.valueOf(20);//converting int into Integer explicitly
	Integer j=20;//autoboxing,now compiler will write Integer.valueOf(a) internally
	System.out.println(20+" "+i+" "+j);

	}

}
