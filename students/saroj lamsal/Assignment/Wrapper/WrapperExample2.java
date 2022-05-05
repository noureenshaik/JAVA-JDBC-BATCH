package workshop;

public class WrapperExample2 {

	public static void main(String[] args) {
	//Converting Integer to int
	Integer a=new Integer(3);	
    int i=3;intValue();//converting Integer to int explicitly
    int j=3;//unboxing,now complier will write a.intValue()internally
    System.out.println(a+" "+i+""+j);
	}

	private static void intValue() {
		// TODO Auto-generated method stub
		
	}

}
