
public class CustomWrapperClass {
	
	private int i;
	
	CustomWrapperClass(){
		
	}
	CustomWrapperClass(int i){
		this.i=i;
	}
	public int getValue() {
		return i;
		
	}
	public void setValue(int i) {
		this.i=i;
	}
	@Override
	public String toString() {
		return Integer.toString(i);
	}

	public static void main(String [] args) {
		
		CustomWrapperClass jp=new CustomWrapperClass(10);
		System.out.println(jp);
		
	
	}
}
